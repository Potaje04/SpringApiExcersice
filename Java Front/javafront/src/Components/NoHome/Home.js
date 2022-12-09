
import React from 'react'

function Home(props) {
    
    const allUSersRouter = () =>{
        props.pageHandler("AllUsers");
    }

    const createUserHandler = () =>{
        props.pageHandler("CreateUsers");
    }

  return (
    <div className='d-flex justify-content-center'>
       <button className='btn btn-primary' onClick={allUSersRouter}>Users</button>
       <button className='btn btn-primary'onClick={createUserHandler}>Create User</button>
    </div>
  )
}

export default Home