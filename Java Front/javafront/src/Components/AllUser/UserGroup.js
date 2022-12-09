import React from 'react'
import User from './User'
function UserGroup(props) {

  return (
    <div>{props.myusers.map((user) => (<User user={user} key={user.name}/>))}</div>
  )
}

export default UserGroup