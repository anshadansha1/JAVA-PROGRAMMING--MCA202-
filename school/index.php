<?php include('db_conn.php') ?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>School</title>
</head>
<h1>Login</h1>
<body>
    <form method="POST" action="">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" name="Login">
    </form>
    <a href="register.php">Register</a>
    <?php
        if($_SERVER['REQUEST_METHOD']=="POST"){
            $username = $_POST['username'];
            $password = $_POST['password'];

            $chk = $conn->query("select * from tbl_profile where username = '$username' and password ='$password'");
            if($chk->num_rows>0){
                session_start();
                $_SESSION['username'] = $username;
                header('Location: profile.php');
            }
            else{
                echo "Invalid username/password!";
            }
        }
    ?>
</body>
</html>