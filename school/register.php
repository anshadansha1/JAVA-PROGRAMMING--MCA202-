<?php include('db_conn.php'); ?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form method="POST" action="">
        <input type="text" name="name" placeholder="Name">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" name="Register">
    </form>
    <a href="index.php">Login</a>
    <?php
        if($_SERVER['REQUEST_METHOD'] == "POST"){
            $name = $_POST['name'];
            $username = $_POST['username'];
            $password = $_POST['password'];

           $ins = $conn->query("insert into tbl_profile(name,username,password)values('$name', '$username', '$password')");
        }
    ?>
</body>
</html>