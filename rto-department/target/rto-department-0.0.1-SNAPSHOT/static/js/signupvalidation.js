var districtByState = {
  "Andhra Pradesh": ['Anantapur', 'Chittoor', 'East Godavari', 'Guntur', 'Krishna', 'Kurnool',
    'Nellore', 'Prakasam', 'Srikakulam', 'Visakhapatnam', 'Vizianagaram', 'West Godavari',
    'Y.S.R. Kadapa'],
  "Maharashtra": ['Ahmednagar', 'Akola', 'Amravati', 'Aurangabad', 'Beed', 'Bhandara', 'Buldhana', 'Chandrapur',
    'Dhule', 'Gadchiroli', 'Gondia', 'Hingoli', 'Jalgaon', 'Jalna', 'Kolhapur', 'Latur', 'Mumbai',
    'Nagpur', 'Nanded', 'Nandurbar', 'Nashik', 'Osmanabad', 'Palghar', 'Parbhani', 'Pune', 'Raigad',
    'Ratnagiri', 'Sangli', 'Satara', 'Sindhudurg', 'Solapur', 'Thane', 'Wardha', 'Washim', 'Yavatmal'],
  "Tamil Nadu": ['Ariyalur', 'Chennai', 'Coimbatore', 'Cuddalore', 'Dharmapuri', 'Dindigul', 'Erode', 'Kallakurichi',
    'Kanchipuram', 'Kanyakumari', 'Karur', 'Krishnagiri', 'Madurai', 'Nagapattinam', 'Namakkal', 'Nilgiris',
    'Perambalur', 'Pudukkottai', 'Ramanathapuram', 'Salem', 'Sivaganga', 'Tenkasi', 'Thanjavur', 'Theni',
    'Thoothukudi', 'Tiruchirappalli', 'Tirunelveli', 'Tiruppur', 'Tiruvallur', 'Tiruvannamalai', 'Vellore',
    'Viluppuram', 'Virudhunagar'],
  "Karnataka": ['Bagalkot', 'Ballari', 'Belagavi', 'Bengaluru Rural',
    'Bengaluru Urban', 'Bidar', 'Chamarajanagar', 'Chikballapur', 'Chikkamagaluru', 'Chitradurga',
    'Dakshina Kannada', 'Davangere', 'Dharwad', 'Gadag', 'Hassan', 'Haveri', 'Kalaburagi',
    'Kodagu', 'Kolar', 'Koppal', 'Mandya', 'Mysuru', 'Raichur', 'Ramanagara', 'Shivamogga',
    'Tumakuru', 'Udupi', 'Uttara Kannada', 'Vijayapura', 'Yadgir'],
  "Kerala": ['Alappuzha', 'Ernakulam', 'Idukki', 'Kannur', 'Kasaragod', 'Kollam', 'Kottayam', 'Kozhikode',
    'Malappuram', 'Palakkad', 'Pathanamthitta', 'Thiruvananthapuram', 'Thrissur', 'Wayanad'],
  "Gujarat": ['Ahmedabad', 'Amreli', 'Anand', 'Aravalli', 'Banaskantha', 'Bharuch', 'Bhavnagar', 'Botad',
    'Chhota Udaipur', 'Dahod', 'Dang', 'Devbhoomi Dwarka', 'Gandhinagar', 'Gir Somnath', 'Jamnagar',
    'Junagadh', 'Kheda', 'Kutch', 'Mahisagar', 'Mehsana', 'Morbi', 'Narmada', 'Navsari', 'Panchmahal',
    'Patan', 'Porbandar', 'Rajkot', 'Sabarkantha', 'Surat', 'Surendranagar', 'Tapi', 'Vadodara', 'Valsad'],
  "Uttar Pradesh": ['Agra', 'Aligarh', 'Ambedkar Nagar', 'Amethi', 'Amroha', 'Auraiya', 'Ayodhya', 'Azamgarh', 'Baghpat',
    'Bahraich', 'Ballia', 'Balrampur', 'Banda', 'Barabanki', 'Bareilly', 'Basti', 'Bhadohi', 'Bijnor', 'Budaun',
    'Bulandshahr', 'Chandauli', 'Chitrakoot', 'Deoria', 'Etah', 'Etawah', 'Farrukhabad', 'Fatehpur', 'Firozabad',
    'Gautam Buddh Nagar', 'Ghaziabad', 'Ghazipur', 'Gonda', 'Gorakhpur', 'Hamirpur', 'Hapur', 'Hardoi', 'Hathras',
    'Jalaun', 'Jaunpur', 'Jhansi', 'Kannauj', 'Kanpur Dehat', 'Kanpur Nagar', 'Kasganj', 'Kaushambi', 'Kheri',
    'Kushinagar', 'Lalitpur', 'Lucknow', 'Maharajganj', 'Mahoba', 'Mainpuri', 'Mathura', 'Mau', 'Meerut', 'Mirzapur',
    'Moradabad', 'Muzaffarnagar', 'Pilibhit', 'Pratapgarh', 'Prayagraj', 'Rae Bareli', 'Rampur', 'Saharanpur',
    'Sambhal', 'Sant Kabir Nagar', 'Shahjahanpur', 'Shamli', 'Shrawasti', 'Siddharthnagar', 'Sitapur', 'Sonbhadra',
    'Sultanpur', 'Unnao', 'Varanasi'],
  "Rajasthan": ['Ajmer', 'Alwar', 'Banswara', 'Baran', 'Barmer', 'Bharatpur', 'Bhilwara', 'Bikaner', 'Bundi',
    'Chittorgarh', 'Churu', 'Dausa', 'Dholpur', 'Dungarpur', 'Hanumangarh', 'Jaipur', 'Jaisalmer', 'Jalore', 'Jhalawar',
    'Jhunjhunu', 'Jodhpur', 'Karauli', 'Kota', 'Nagaur', 'Pali', 'Pratapgarh', 'Rajsamand', 'Sawai Madhopur', 'Sikar',
    'Sirohi', 'Tonk', 'Udaipur'],
  "West Bengal": ['Alipurduar', 'Bankura', 'Birbhum', 'Cooch Behar', 'Dakshin Dinajpur', 'Darjeeling', 'Hooghly', 'Howrah',
    'Jalpaiguri', 'Jhargram', 'Kalimpong', 'Kolkata', 'Malda', 'Murshidabad', 'Nadia', 'North 24 Parganas',
    'Paschim Bardhaman', 'Purba Bardhaman', 'Purba Medinipur', 'Purulia', 'South 24 Parganas', 'Uttar Dinajpur'],
  "Bihar": ['Araria', 'Arwal', 'Aurangabad', 'Banka', 'Begusarai', 'Bhagalpur', 'Bhojpur', 'Buxar', 'Darbhanga',
    'East Champaran', 'Gaya', 'Gopalganj', 'Jamui', 'Jehanabad', 'Kaimur', 'Katihar', 'Khagaria',
    'Kishanganj', 'Lakhisarai', 'Madhepura', 'Madhubani', 'Munger', 'Muzaffarpur', 'Nalanda', 'Nawada',
    'Patna', 'Purnia', 'Rohtas', 'Saharsa', 'Samastipur', 'Saran', 'Sheikhpura', 'Sheohar', 'Sitamarhi', 'Siwan',
    'Supaul', 'Vaishali', 'West Champaran']
};

function makeSubmenu(value) {
  if (value.length == 0) {
    document.getElementById("districtSelect").innerHTML = "<option></option>";
  }
  else {
    var districtsOptions = '';
    for (districtId in districtByState[value]) {
      districtsOptions += "<option>" + districtByState[value][districtId] + "</option>";
    }
    document.getElementById("districtSelect").innerHTML = districtsOptions;
  }
}

function handleFirst() {
  const fname = document.getElementById("firstName").value;
  const sub = document.getElementById("submit");
  if (fname.length < 3 || fname.length > 20) {
    document.getElementById("fnmsg").innerHTML = "<span style='color: red'>First name: 3-20 characters required</span>";
    sub.disabled = true;
  } else {
    document.getElementById("fnmsg").innerHTML = "<span style='color: green'>Firstname is valid</span>";
    sub.disabled = false;
  }
  if (fname.length === 0) {
    document.getElementById("fnmsg").innerHTML = "";
  }
}

function handleEmail() {
  const em = document.getElementById("email").value;
  const sub = document.getElementById("submit");
  if (em.match(/^[a-z]+@[a-z]+\.[a-z]{3}$/)) {
    document.getElementById("emsg").innerHTML = "<span style='color: green'>Email is valid</span>";
    sub.disabled = false;
  } else {
    document.getElementById("emsg").innerHTML = "<span style='color: red'>Invalid Email format</span>";
    sub.disabled = true;
  }
  if (em.length === 0) {
    document.getElementById("emsg").innerHTML = "";
  }
}

function handleLast() {
  const lname = document.getElementById("lastName").value;
  const sub = document.getElementById("submit");
  if (lname.length > 2) {
    document.getElementById("lnmsg").innerHTML = "<span style='color: red'>Last name: max 2 characters</span>";
    sub.disabled = true;
  } else {
    document.getElementById("lnmsg").innerHTML = "<span style='color: green'>Lastname is valid</span>";
    sub.disabled = false;
  }
  if (lname.length === 0) {
    document.getElementById("lnmsg").innerHTML = "";
  }
}

function handlePhone() {
  const ph = document.getElementById("phoneNumber").value;
  const sub = document.getElementById("submit");
  if (ph.length !== 10) {
    document.getElementById("phmsg").innerHTML = "<span style='color: red'>Phonenumber should be 10 digits</span>";
    sub.disabled = true;
  } else {
    document.getElementById("phmsg").innerHTML = "<span style='color: green'>Phonenumber is valid</span>";
    sub.disabled = false;
  }
  if (ph.length === 0) {
    document.getElementById("phmsg").innerHTML = "";
  }
}

function handlePass() {
  const psw = document.getElementById("password").value;
  const sub = document.getElementById("submit");
  if (psw.length < 6) {
    document.getElementById("pamsg").innerHTML = "<span style='color: red'>Password min 6 characters</span>";
    sub.disabled = true;
  } else {
    document.getElementById("pamsg").innerHTML = "<span style='color: green'>Password is valid</span>";
    sub.disabled = false;
  }
  if (psw.length === 0) {
    document.getElementById("pamsg").innerHTML = "";
  }
}

function handleConfPass() {
  const psw = document.getElementById("password").value;
  const cpsw = document.getElementById("confirmPassword").value;
  const sub = document.getElementById("submit");
  if (psw !== cpsw) {
    document.getElementById("cpamsg").innerHTML = "<span style='color: red'>Confirm Password won't match</span>";
    sub.disabled = true;
  } else {
    document.getElementById("cpamsg").innerHTML = "<span style='color: green'>Confirm Password matches</span>";
    sub.disabled = false;
  }
  if (cpsw.length === 0) {
    document.getElementById("cpamsg").innerHTML = "";
  }
}