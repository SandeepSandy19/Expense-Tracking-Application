// reacts
import { useEffect, useRef } from "react";

// rrd imports
import { Form, useFetcher } from "react-router-dom"

// library imports
import { CurrencyRupeeIcon } from "@heroicons/react/24/solid"

const AddBudgetForm = () => {
  const fetcher = useFetcher();
  const isSubmitting = fetcher.state === "submitting"

  const formRef = useRef();
  const focusRef = useRef();

  useEffect(() => {
    if (!isSubmitting) {
      formRef.current.reset()
      focusRef.current.focus()
    }
  }, [isSubmitting])

  return (
    <div className="form-wrapper">
      <h2 className="h3">
        Create budget
      </h2>
      <fetcher.Form
        method="post"
        className="grid-sm"
        ref={formRef}
      >
        <div className="grid-xs">
          <label htmlFor="newBudget">Budget Catogory</label>
          <input
            type="text"
            name="newBudget"
            id="newBudget"
            placeholder="Ex :  Electronics"
            required
            ref={focusRef}
          />
        </div>
        <div className="grid-xs">
          <label htmlFor="newBudgetAmount">Enter Money</label>
          <input
            type="number"
            step="0.01"
            name="newBudgetAmount"
            id="newBudgetAmount"
            placeholder="Ex : 1300/-"
            required
            inputMode="decimal"
          />
        </div>
        <input type="hidden" name="_action" value="createBudget" />
        <button type="submit" className="btn btn--dark" disabled={isSubmitting}>
          {
            isSubmitting ? <span>Submitting…</span> : (
              <>
                <span>Create</span>
              </>
            )
          }
        </button>
      </fetcher.Form>
    </div>
  )
}
export default AddBudgetForm