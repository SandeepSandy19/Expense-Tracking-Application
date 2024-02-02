// rrd imports
import { Form, NavLink } from "react-router-dom"

// library
import { TrashIcon } from '@heroicons/react/24/solid'

// assets
import logomark from "../assets/logo.svg"

const Nav = ({ userName }) => {
  return (
    <nav>
      <NavLink
        to="/"
        aria-label="Go to home"
      >
        <img src={logomark} alt="" height={30} />
        <span>Expense Traking Application</span>
      </NavLink>
      {
        userName && (
          <Form
            method="post"
            action="logout"
            onSubmit={(event) => {
              if (!confirm("Delete user and all data?")) {
                event.preventDefault()
              }
            }}
          >
            <button type="submit" className="btn btn--dark">
              <span>Delete User</span>
            </button>

          </Form>
        )
      }
    </nav>
  )
}
export default Nav