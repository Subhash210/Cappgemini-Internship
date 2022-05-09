import React from 'react'


function Payment() {
  return (
    <script>{
      window.location.replace("http://localhost:8090/pay")
    }</script>
  )
}

export default Payment