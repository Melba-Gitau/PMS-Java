<div class = "container">
<h1>JOB details:</h1>
<form action="/apply" method="post">
    @csrf
    <input type="text" name="title" placeholder="title"><br><br>
    <input type="text" name="contract" placeholder="contract type"><br><br>
    <input type="textarea" name="desc" placeholder="description"><br><br>
    <input type="text" name="date" placeholder="input date"><br><br>
    <button type="submit">Apply</button>
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
