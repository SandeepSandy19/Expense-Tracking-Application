import { Form } from "react-router-dom"

// library
import { UserPlusIcon } from "@heroicons/react/24/solid";

// assets
import expenses from "../assets/expenses.jpg"
import piggy from "../assets/piggy.png"

const Intro = () => {
  return (
    <div className="intro">
      <div>
        <h1>
          Empower your financial path <span className="accent">with pecision</span>
        </h1>
        <p>
          Tracking every expense, shaping a prosperous tomorrow.
        </p>
        <Form method="post">
          <input
            type="text"
            name="userName"
            required
            placeholder="Enter your name?" aria-label="Your Name" autoComplete="given-name"
          />
          <input type="hidden" name="_action" value="newUser" />
          <button type="submit" className="btn btn--dark">
            <span>Start Tracking</span>
          </button>
        </Form>
      </div>
      <img src={piggy} alt="Person with money" width={600} />
    </div>
  )
}
export default Intro