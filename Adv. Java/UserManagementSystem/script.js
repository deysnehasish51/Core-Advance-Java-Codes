function loadPage(page){

const content=document.getElementById("content");

/* ---------------- HOME PAGE ---------------- */

if(page==="home"){

content.innerHTML=`

<div class="card">

<h1>Welcome to Management Dashboard</h1>

<br>

<p>
This dashboard helps administrators manage users, students and employees
efficiently. It provides organized modules for performing operations,
viewing records and managing information in a structured way.
</p>

<br>

<p>
The system is designed to integrate with backend technologies like
Java Servlets and Oracle Database for enterprise level applications.
</p>

<br>

<div class="buttons">
<button class="primary" onclick="loadPage('user')">Go to Modules</button>
</div>

</div>

`;

}

/* ---------------- ABOUT PAGE ---------------- */

if(page==="about"){

content.innerHTML=`

<div class="card">

<h2>About Our System</h2>

<br>

<p>

The Management Dashboard is a centralized platform designed to simplify
data handling within organizations. It provides modules to manage users,
students and employees in a secure and organized manner.

</p>

<br>

<p>

The interface is built to be simple yet powerful, enabling administrators
to perform CRUD operations, search records and manage data efficiently.

</p>

<br>

<p>

This system integrates easily with backend technologies such as
Java Servlets, JSP and Oracle Database to provide a complete enterprise
solution for data management.

</p>

</div>

`;

}

/* ---------------- FEEDBACK PAGE ---------------- */

if(page==="feedback"){

content.innerHTML=`

<div class="card">

<h2>Share Your Feedback</h2>

<br>

<input placeholder="Your Name">

<br><br>

<input placeholder="Your Email">

<br><br>

<textarea rows="5" placeholder="Write your feedback here"></textarea>

<div class="buttons">
<button class="primary">Submit Feedback</button>
</div>

</div>

`;

}

/* ---------------- USER MODULE ---------------- */

if(page==="user"){

content.innerHTML=`

<h2>User Module</h2>

<div class="tabs">
<button onclick="userCreate()">Create</button>
<button onclick="userRead()">View</button>
<button onclick="userUpdate()">Update</button>
<button onclick="userDelete()">Delete</button>
</div>

<div id="moduleContent"></div>

`;

userCreate();

}

/* ---------------- STUDENT MODULE ---------------- */

if(page==="student"){

content.innerHTML=`

<h2>Student Module</h2>

<div class="tabs">
<button onclick="studentCreate()">Add</button>
<button onclick="studentRead()">View</button>
<button onclick="studentUpdate()">Update</button>
<button onclick="studentDelete()">Delete</button>
</div>

<div id="moduleContent"></div>

`;

studentCreate();

}

/* ---------------- EMPLOYEE MODULE ---------------- */

if(page==="employee"){

content.innerHTML=`

<h2>Employee Module</h2>

<div class="tabs">
<button onclick="employeeCreate()">Add</button>
<button onclick="employeeRead()">View</button>
<button onclick="employeeUpdate()">Update</button>
<button onclick="employeeDelete()">Delete</button>
</div>

<div id="moduleContent"></div>

`;

employeeCreate();

}

}

/* ======================================================
USER CRUD UI
====================================================== */

function userCreate(){

moduleContent.innerHTML=`

<div class="card">

<h3>Create User</h3>

<div class="form-grid">

<input placeholder="Full Name">
<input placeholder="Email Address">

<select>
<option>Select Role</option>
<option>Admin</option>
<option>User</option>
</select>

<input placeholder="Department">

<input placeholder="Phone Number">
<input placeholder="Status">

</div>

<div class="buttons">
<button class="secondary">Cancel</button>
<button class="primary">Register User</button>
</div>

</div>

`;

}

function userRead(){

moduleContent.innerHTML=`

<div class="card">

<h3>View Users</h3>

<div class="search-box">

<select>
<option>Search by ID</option>
<option>Search by Name</option>
<option>Search by Email</option>
<option>Search by Department</option>
</select>

<input placeholder="Enter search value">

<button class="primary">Search</button>

</div>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Role</th>
<th>Department</th>
<th>Status</th>
</tr>

<tr>
<td>101</td>
<td>John Doe</td>
<td>john@mail.com</td>
<td>Admin</td>
<td>IT</td>
<td>Active</td>
</tr>

</table>

</div>

`;

}

function userUpdate(){

moduleContent.innerHTML=`

<div class="card">

<h3>Update User</h3>

<input placeholder="Enter User ID">

<div class="form-grid">

<input placeholder="New Name">
<input placeholder="New Email">

<select>
<option>Admin</option>
<option>User</option>
</select>

<input placeholder="Department">

<input placeholder="Phone">
<input placeholder="Status">

</div>

<div class="buttons">
<button class="primary">Update User</button>
</div>

</div>

`;

}

function userDelete(){

moduleContent.innerHTML=`

<div class="card">

<h3>Delete User</h3>

<div class="delete-box">

<input placeholder="Enter User ID">

<div class="buttons">
<button class="primary">Delete User</button>
</div>

</div>

</div>

`;

}

/* ======================================================
STUDENT CRUD UI
====================================================== */

function studentCreate(){

moduleContent.innerHTML=`

<div class="card">

<h3>Add Student</h3>

<div class="form-grid">

<input placeholder="Student Name">
<input placeholder="Roll Number">

<input placeholder="Course">
<input placeholder="Department">

<input placeholder="Email">
<input placeholder="Phone Number">

</div>

<div class="buttons">
<button class="primary">Save Student</button>
</div>

</div>

`;

}

function studentRead(){

moduleContent.innerHTML=`

<div class="card">

<h3>View Students</h3>

<div class="search-box">

<select>
<option>Search by Roll No</option>
<option>Search by Name</option>
<option>Search by Course</option>
<option>Search by Department</option>
</select>

<input placeholder="Enter search value">

<button class="primary">Search</button>

</div>

<table>

<tr>
<th>Roll No</th>
<th>Name</th>
<th>Course</th>
<th>Department</th>
<th>Email</th>
</tr>

<tr>
<td>201</td>
<td>Rahul Sharma</td>
<td>B.Tech</td>
<td>CSE</td>
<td>rahul@mail.com</td>
</tr>

</table>

</div>

`;

}

function studentUpdate(){

moduleContent.innerHTML=`

<div class="card">

<h3>Update Student</h3>

<input placeholder="Enter Roll Number">

<div class="form-grid">

<input placeholder="New Name">
<input placeholder="Course">

<input placeholder="Department">
<input placeholder="Email">

<input placeholder="Phone">
<input placeholder="Status">

</div>

<div class="buttons">
<button class="primary">Update Student</button>
</div>

</div>

`;

}

function studentDelete(){

moduleContent.innerHTML=`

<div class="card">

<h3>Delete Student</h3>

<div class="delete-box">

<input placeholder="Enter Roll Number">

<div class="buttons">
<button class="primary">Delete Student</button>
</div>

</div>

</div>

`;

}

/* ======================================================
EMPLOYEE CRUD UI
====================================================== */

function employeeCreate(){

moduleContent.innerHTML=`

<div class="card">

<h3>Add Employee</h3>

<div class="form-grid">

<input placeholder="Employee Name">
<input placeholder="Employee ID">

<input placeholder="Designation">
<input placeholder="Department">

<input placeholder="Salary">
<input placeholder="Email">

</div>

<div class="buttons">
<button class="primary">Save Employee</button>
</div>

</div>

`;

}

function employeeRead(){

moduleContent.innerHTML=`

<div class="card">

<h3>View Employees</h3>

<div class="search-box">

<select>
<option>Search by ID</option>
<option>Search by Name</option>
<option>Search by Department</option>
<option>Search by Designation</option>
</select>

<input placeholder="Enter search value">

<button class="primary">Search</button>

</div>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Designation</th>
<th>Department</th>
<th>Salary</th>
</tr>

<tr>
<td>501</td>
<td>Amit Kumar</td>
<td>Manager</td>
<td>HR</td>
<td>60000</td>
</tr>

</table>

</div>

`;

}

function employeeUpdate(){

moduleContent.innerHTML=`

<div class="card">

<h3>Update Employee</h3>

<input placeholder="Enter Employee ID">

<div class="form-grid">

<input placeholder="New Name">
<input placeholder="Designation">

<input placeholder="Department">
<input placeholder="Salary">

<input placeholder="Email">
<input placeholder="Phone">

</div>

<div class="buttons">
<button class="primary">Update Employee</button>
</div>

</div>

`;

}

function employeeDelete(){

moduleContent.innerHTML=`

<div class="card">

<h3>Delete Employee</h3>

<div class="delete-box">

<input placeholder="Enter Employee ID">

<div class="buttons">
<button class="primary">Delete Employee</button>
</div>

</div>

</div>

`;

}

/* DEFAULT PAGE */

loadPage("home");