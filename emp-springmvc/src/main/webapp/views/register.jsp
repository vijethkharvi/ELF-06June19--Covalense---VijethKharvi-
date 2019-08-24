<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Information</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style1.css">

</head>
<body  style="background:lightgoldenrodyellow">
   
      
  <div class="container mx-auto mt-4">
   <div class="card-body" >
    <p class="h3" style="margin-left: 40%">Employee Information</p>
    <hr>
<form   name="myform" method="POST" action="./insert" onsubmit="return validateform()">
    <div class="row">
      <div class="col">
            <label for="exampleInputEmail1">Id</label>
        <input type="text" name="id" class="form-control" placeholder="Employee Id">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">Name</label>
    <input type="text" name="name" class="form-control" placeholder="Enter Name">
      </div>
    </div>
    <div class="row">
      <div class="col">
            <label for="exampleInputEmail1">Password</label>
        <input type="text" name="password" class="form-control" placeholder="Enter password...">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">Confirm Pasword</label>
    <input type="text" name="cpassword" class="form-control" placeholder="Confirm Password...">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">Account Number</label>
    <input type="text" name="accountNumber" class="form-control" placeholder="Account Number">
  </div>
     
      <div class="col">
            <label for="exampleInputEmail1">Email Id</label>
        <input type="text" name="email" class="form-control" placeholder="Email Id">
      </div>
    </div>
    <div class="row">
      <div class="col">
            <label for="exampleInputEmail1">Age</label>
        <input type="text" name="age" class="form-control" placeholder="Age">
      </div>
      <div class="col">
            <label for="exampleInputEmail1">Designation</label>
        <input type="text" name="designation" class="form-control" placeholder="Designation">
    </div>
    </div>
    <div class="row">
            <div class="col">
                    <label for="inputGender">Gender</label>
                    <select id="inputGender" name="gender" class="form-control">
                      <option selected>--select one--</option>
                <option value="male">male</option>
                <option value="female">female</option>
                <option value="other">other</option>
            </select>
            </div>
            <div class="col">
                    <label for="exampleInputEmail1">Date of Birth</label>
                <input type="date" name="dob" class="form-control" placeholder="dd-mm-yyyy">
            </div>
      </div>
    <div class="row">
            <div class="col">
                  <label for="exampleInputEmail1">Salary</label>
              <input type="text" name="salary" class="form-control" placeholder="Salary">
            </div>
            <div class="col">
                  <label for="exampleInputEmail1">Department Id</label>
              <input type="text" name="departmentId" class="form-control" placeholder="Department Id">
          </div>
          </div>
          <div class="row">
                <div class="col">
                      <label for="exampleInputEmail1">Phone Number</label>
                  <input type="text" name="phone" class="form-control" placeholder="Phone Number">
                </div>
                <div class="col">
                      <label for="exampleInputEmail1">Manager Id</label>
                  <input type="text" name="managerId" class="form-control" placeholder="Manager Id">
              </div>
              </div>
              <div class="row">
                 
                    <div class="col-6">
                        <label for="exampleInputEmail1">Joining Date</label>
                      <input type="date" name="joiningDate" class="form-control" placeholder="Joining Date">
                    </div>
                  
</div>
</div>
 <div class="container mx-auto mt-4" >
      <div class="card-body" >
      
        <p class="h3" style="margin-left: 30%">EMPLOYEE OTHER INFORMATION</p>
        <hr>
        <div class="row">
         <!--  <div class="col">
                <label for="exampleInputEmail1">ID</label>
            <input type="number" name="id" class="form-control" placeholder="Please Enter ID">
          </div> -->
          <div class="col">
                <label for="exampleInputemergenum">Emergency Contact Number</label>
            <input type="text" name="otherInfo.emergency_contact_number" class="form-control" placeholder="Please Enter Emergency Contact Number">
          </div>
          <div class="col">
                <label for="exampleInputmotname">Mother Name</label>
            <input type="text" name="otherInfo.mother_nm" class="form-control" placeholder="Please Enter Mother Name">
          </div>
        </div>
        <div class="row">
          <div class="col">
                <label for="exampleInputPan">Pan Number</label>
            <input type="text" name="otherInfo.pan" class="form-control" placeholder="Please Enter Pan Number">
          </div>
          <div class="col">
                <label for="exampleInputemergeName">Emergency Contact Name</label>
            <input type="text" name="otherInfo.emergency_contact_name" class="form-control" placeholder="Please Enter Emergency Contact Name">
          </div>
          <div class="col">
                <label for="exampleInputspouse">Spouse Name</label>
            <input type="text" name="otherInfo.spouse_nm" class="form-control" placeholder="Please Enter Spouse Name">
          </div>
        </div>
        <div class="row">
                <div class="col">
                        <label for="inputStatus">Marital Status</label>
                        <select id="inputStatus" name="otherInfo.ismarried" class="form-control">
                          <option selected>Married</option>
                    <option value="married">Married</option>
                    <option value="unmarried">Unmarried</option>
                    <option value="divorcee">Divorcee</option>
                </select>
                </div>
                <div class="col">
                        <label for="inputnationality">Nationality</label>
                        <select id="inputnationality" name="otherInfo.nationality" class="form-control">
                          <option selected>---Select One---</option>
                    <option value="indian">Indian</option>
                    <option value="other">Other</option>
                </select>
                </div>
                <div class="col">
                        <label for="exampleInputpassport">Passport Number</label>
                    <input type="text" name="otherInfo.passport" class="form-control" placeholder="Please Enter Passport Number">
                  </div>
        </div>
        <div class="row">
        <div class="col">
                <label for="inputbloodgrp">Blood Group</label>
                <select id="inputbloodgrp" name="otherInfo.blood_grp" class="form-control">
                  <option selected>---Select One---</option>
            <option value="AB+">AB+</option>
            <option value="AB-">AB-</option>
            <option value="A+">A+</option>
            <option value="A-">A-</option>
            <option value="o+">o+</option>
            <option value="o-">o-</option>
        </select>
        </div>
        <div class="col">
                <label for="inputreligion">Religion</label>
                <select id="inputreligion"  name="otherInfo.religion" class="form-control">
                  <option selected>---Select One---</option>
            <option value="hindu">Hindu</option>
            <option value="christian">Christian</option>
            <option value="muslim">Muslim</option>
        </select>
        </div>
        <div class="col">
                <label for="exampleInputaadhar">Aadhar Number</label>
            <input type="text" name="otherInfo.adhar" class="form-control" placeholder="Please Enter Aadhar Number">
          </div>
        </div>
        <div class="row">
                <div class="col">
                        <label for="inputphysicallych">Physically Challnged</label>
                        <select id="inputphysicallych" name="otherInfo.ischallenged" class="form-control">
                          <option selected>---Select One---</option>
                    <option value="yes">Yes</option>
                    <option value="no">No</option>
                </select>
                </div>
                <div class="col">
                        <label for="exampleInputfather">Father Number</label>
                    <input type="text" name="otherInfo.father_nm" class="form-control" placeholder="Please Enter Father Number">
                  </div>
                  <div class="col-3">
                        <br>
                          <button  type="submit"class="form-control form-control btn btn-outline-secondary"> Submit</button>

                      </div ><div class="col-3">
                        <br>
                          <button type="reset" class="form-control form-control btn btn-outline-success"  >reset</button>
                      </div>
          </div>
                     
                           
      </form>
      </div>
    </div>
  
  
</body>
</html>