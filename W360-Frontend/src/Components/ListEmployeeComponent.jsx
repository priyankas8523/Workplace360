import React, {useEffect, useState} from 'react'
import { listEmployees } from '../Services/EmployeeService'

const ListEmpComponent = () => {

    const [employees, setEmployees] = useState([])

    useEffect(() => {
        listEmployees().then((response)=>{
            setEmployees(response.data);
        }).catch(error => {
            console.error(error);
        })

    }, [])

  return (
    <div className = 'container'>
        <h1>List of Employees</h1>
        <table className = 'table table-striped table-bordered'>
            <thead>
            <tr>
                <th>Employee Id</th>
                <th>Employee Firstname</th>
                <th>Employee Lastname</th>
                <th>Employee Email</th>

            </tr>
            </thead>
            <tbody>
                {
                    employees.map(employee =>
                        <tr key = {employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>
                        </tr>
                    )
                }
                <tr>

                </tr>
            </tbody>
        </table>
    </div>
  )
}

export default ListEmpComponent