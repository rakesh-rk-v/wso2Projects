<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume</title>
</head>
<body>
	<form action="">
	 <fieldset>
        <legend>
            Personal Details
        </legend>
        <table>
            <tr>
                <td>Student Name: </td>
                <td><input type="text" size="20" placeholder="Enter Your Name" name="Name" required></td>
               
            </tr>
            <tr>
                <td>Age :</td>
                <td><input type="number" name="Age" placeholder="Enter Your age" pattern="maxvalue=60"  required></td>
            </tr>
            <tr>
                <td>Mail-Id :</td>
                <td><input name ="Mail" type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
            </tr>
            <tr>
                <td>Date Of Birth :</td>
                <td><input type="date" required name="Dob"></td>
            </tr>
            <tr>
                <td>Address : </td>
                <td><input type="text" name="Addr" required></td>
            </tr>
            <tr>
                <td>Gender :</td>
                <td><input type="radio" name="Gen" value="Male"> Male <input type="radio" name="Gen" value="FeMale">Female <input type="radio" name="Gen" value="Custom">Custom</td>
               
            </tr>
            <tr>
                <td>Skills </td>
                <td><input type="checkbox" value="Java" name="">Java <input type="checkbox" value="Python">Python</td>
            </tr>
            <tr>
                <td>Country</td>
                <td><select name="country">
                    <option value="ind" >INDIA</option>
                    <option value="usa" >USA</option>
                    <option value="rus" >RUSSIA</option>
                    <option value="lon" >LONDON</option>
                </select></td>
            </tr>
            <tr>
                <td>Upload Your Resume</td>
                <td><input type="file" name="res" value="resume"></td>
            </tr>
            <tr>
                <td align="center">
                    <input type="submit" value="Submit" style="color:green;height:100% ;width:100% ;">
                </td>
            <td align="center">
                <input type="reset" style="color:red ;height:100% ;width:50% ;" >
            </td>
            
            </tr>
        </table>
    </fieldset>
		</form>
</body>
</html>


