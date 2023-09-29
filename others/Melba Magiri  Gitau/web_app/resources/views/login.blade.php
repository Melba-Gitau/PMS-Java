<div class ="container">

<h1>Login</h1>
<form action="/" method="post">
    @csrf
    <input type="text" name="name" placeholder="Enter username"><br><br>
    <input type="email" name="email" placeholder="Enter email"><br><br>
    <input type="password" name="password" placeholder="Enter password"><br><br>
    <input type="text" name="gender" placeholder="Gender"><br><br>
    <input type="text" name="phone" placeholder="Enter phone"><br><br>
    <input type="number" name="age" placeholder="Age"><br><br>
    <input type="text" name="address" placeholder="Enter address"><br><br>
    <button type="submit">Login</button>
</form>

</div>
<style>
*{
    margin:0;
    padding:0;
}
.container{
    margin-left:30%;
    margin-top:10%;
    padding:5px;
}
</style>

