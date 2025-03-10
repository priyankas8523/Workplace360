import { useState } from 'react'
import './App.css'
import ListEmpComponent from './Components/ListEmployeeComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <ListEmpComponent/>
    </>
  )
}

export default App
