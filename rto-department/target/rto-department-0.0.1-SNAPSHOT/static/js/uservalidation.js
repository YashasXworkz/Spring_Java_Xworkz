const data = {
  'Andhra Pradesh': {
    districts: [
      'Anantapur', 'Chittoor', 'East Godavari', 'Guntur', 'Krishna', 'Kurnool',
      'Nellore', 'Prakasam', 'Srikakulam', 'Visakhapatnam', 'Vizianagaram', 'West Godavari',
      'Y.S.R. Kadapa'],
    rtoOffices: ['Adilabad-AP01', 'All Andhra Districts-AP39', 'Ananthapur-AP02', 'Chittoor-AP03', 'Eluru-AP37', 'Guntur-AP08', 'Guntur-AP07', 'Hyderabad-AP09', 'Kadapa-AP04', 'Kakinada-AP06', 'Kakinada-AP05', 'Kurnool-AP21', 'Narsipatnam-AP33', 'Nellore-AP26', 'Ongole-AP27', 'Secunderabad-AP10', 'Srikakulam-AP29', 'State Police Vehicles-AP39 P', 'State Road Transport Vehicles-AP39 Z', 'Vijayawada-AP18', 'Vijayawada-AP16', 'Visakhapatnam-AP32', 'Visakhapatnam-AP31', 'Visakhapatnam-AP30', 'Vizianagaram-AP34']
  },
  'Maharashtra': {
    districts: [
      'Ahmednagar', 'Akola', 'Amravati', 'Aurangabad', 'Beed', 'Bhandara', 'Buldhana', 'Chandrapur',
      'Dhule', 'Gadchiroli', 'Gondia', 'Hingoli', 'Jalgaon', 'Jalna', 'Kolhapur', 'Latur', 'Mumbai',
      'Nagpur', 'Nanded', 'Nandurbar', 'Nashik', 'Osmanabad', 'Palghar', 'Parbhani', 'Pune', 'Raigad',
      'Ratnagiri', 'Sangli', 'Satara', 'Sindhudurg', 'Solapur', 'Thane', 'Wardha', 'Washim', 'Yavatmal'],
    rtoOffices: ['Ahmednagar-MH16', 'Akluj-MH45', 'Akola-MH30', 'Ambejogai-MH44', 'Amravati-MH27', 'Aurangabad-MH20', 'Baramati-MH42', 'Beed-MH23', 'Bhandara-MH36', 'Borivali-MH47', 'Buldhana-MH28', 'Chandrapur-MH34', 'Dhule-MH18', 'Gadchiroli-MH33', 'Gondia-MH35', 'Hingoli-MH38', 'Jalgaon-MH19', 'Jalna-MH21', 'Kalyan-MH05', 'Karad-MH50', 'Kolhapur-MH09', 'Kudal-MH07', 'Latur-MH24', 'Malegaon-MH41', 'Mumbai Central-MH01', 'Mumbai East-MH03', 'Mumbai West-MH02', 'Nagpur-MH31', 'Nagpur East-MH49', 'Nagpur Rural-MH40', 'Nanded-MH26', 'Nandurbar-MH39', 'Nashik-MH15', 'Nashik Rural-MH51', 'Osmanabad-MH25', 'Panvel-MH46', 'Parbhani-MH22', 'Pen Raigad-MH06', 'Pimpri Chinchwad-MH14', 'Pune-MH12', 'Ratnagiri-MH08', 'Sangli-MH10', 'Satara-MH11', 'Solapur-MH13', 'Srirampur-MH17', 'Thane-MH04', 'Vasai-MH48', 'Vashi Navi Mumbai-MH43', 'Wardha-MH32', 'Washim-MH37', 'Yavatmal-MH29']
  },
  'Tamil Nadu': {
    districts: [
      'Ariyalur', 'Chennai', 'Coimbatore', 'Cuddalore', 'Dharmapuri', 'Dindigul', 'Erode', 'Kallakurichi',
      'Kanchipuram', 'Kanyakumari', 'Karur', 'Krishnagiri', 'Madurai', 'Nagapattinam', 'Namakkal', 'Nilgiris',
      'Perambalur', 'Pudukkottai', 'Ramanathapuram', 'Salem', 'Sivaganga', 'Tenkasi', 'Thanjavur', 'Theni',
      'Thoothukudi', 'Tiruchirappalli', 'Tirunelveli', 'Tiruppur', 'Tiruvallur', 'Tiruvannamalai', 'Vellore',
      'Viluppuram', 'Virudhunagar'],
    rtoOffices: ['Ambattur-TN13', 'Arani-TN97', 'Ariyalur-TN61', 'Attur-TN77', 'Chengalpattu-TN19', 'Chennai Central-TN01', 'Chennai East-TN04', 'Chennai North-TN05',
      'Chennai North East-TN03', 'Chennai North West-TN02', 'Chennai South-TN07', 'Chennai South East-TN06', 'Chennai South West-TN10', 'Chennai West-TN09',
      'Chidambaram-TN91', 'Coimbatore Central-TN66', 'Coimbatore North-TN38', 'Coimbatore South-TN37', 'Coimbatore West-TN99', 'Cuddalore-TN31', 'Dharapuram-TN78',
      'Dharmapuri-TN29', 'Dindigul-TN57', 'Erode East-TN33', 'Erode West-TN86', 'Gobichettipalayam-TN36', 'Hosur-TN70', 'Kancheepuram-TN21', 'Karur-TN47',
      'Kovilpatti-TN96', 'Krishnagiri-TN24', 'Kumbakonam-TN68', 'Kundrathur-TN85', 'Madurai Central-TN64', 'Madurai North-TN59', 'Madurai South-TN58',
      'Marthandam-TN75', 'Mayiladuthurai-TN82', 'Meenambakkam-TN22', 'Mettupalayam-TN40', 'Mettur-TN93', 'Nagapattinam-TN51', 'Nagercoil-TN74',
      'Namakkal North-TN28', 'Namakkal South-TN88', 'Ooty-TN43', 'Palani-TN94', 'Perambalur-TN46', 'Perundurai-TN56', 'Pollachi-TN41', 'Poonamallee-TN12',
      'Pudukottai-TN55', 'Ramanathapuram-TN65', 'Ranipet-TN73', 'Redhills-TN18', 'Salem-TN27', 'Salem East-TN54', 'Salem South-TN90', 'Salem West-TN30',
      'Sankarankovil-TN79', 'Sankari-TN52', 'Sholinganallur-TN14', 'Sivaganga-TN63', 'Sivakasi-TN95', 'Sriperumbudur-TN87', 'Srirangam-TN48',
      'Srivilliputtur-TN84', 'Tambaram-TN11', 'Tenkasi-TN76', 'Thanjavur-TN49', 'Theni-TN60', 'Thiruchendur-TN92', 'Thiruvarur-TN50',
      'Thiruverumbur East-TN81', 'Tindivanam-TN16', 'Tiruchengode-TN34', 'Tiruchirappalli West-TN45', 'Tirunelveli-TN72', 'Tiruppur North-TN39',
      'Tiruppur South-TN42', 'Tiruvallur-TN20', 'Tiruvannamalai-TN25', 'Tuticorin-TN69', 'Ulundurpet-TN15', 'Vaniyambadi-TN83', 'Vellore-TN23',
      'Viluppuram-TN32', 'Virudhunagar-TN67']
  },
  'Karnataka': {
    districts: [
      'Bagalkot', 'Ballari', 'Belagavi', 'Bengaluru Rural',
      'Bengaluru Urban', 'Bidar', 'Chamarajanagar', 'Chikballapur', 'Chikkamagaluru', 'Chitradurga',
      'Dakshina Kannada', 'Davangere', 'Dharwad', 'Gadag', 'Hassan', 'Haveri', 'Kalaburagi',
      'Kodagu', 'Kolar', 'Koppal', 'Mandya', 'Mysuru', 'Raichur', 'Ramanagara', 'Shivamogga',
      'Tumakuru', 'Udupi', 'Uttara Kannada', 'Vijayapura', 'Yadgir'],
    rtoOffices: ['Athani-KA71', 'Bagalkot-KA29', 'Bailhongal-KA24', 'Ballari-KA34', 'Banashankari-KA58', 'Bangalore Central-KA01', 'Bangalore East-KA03', 'Bangalore North-KA04', 'Bangalore South-KA05', 'Bangalore West-KA02', 'Bantwal-KA70', 'Basavakalyana-KA56', 'Belagavi-KA22', 'Bhalki-KA39', 'Bidar-KA38', 'Chamarajanagar-KA10', 'Chandapura-KA59', 'Chikkaballapur-KA40', 'Chikkamagaluru-KA18', 'Chikkodi-KA23', 'Chintamani-KA67', 'Chitradurga-KA16', 'Dandeli-KA65', 'Davanagere-KA17', 'Devanahalli-KA43', 'Dharwad East-KA63', 'Dharwad West-KA25', 'Eelctronic City-KA51', 'Gadag-KA26', 'Gokak-KA49', 'Hassan-KA13', 'Haveri-KA27', 'Honnavar-KA47', 'Hosapete-KA35', 'Hunsur-KA45', 'Jamkhandi-KA48', 'KR Puram-KA53', 'Kalaburagi-KA32', 'Karwar-KA30', 'Kolar-KA07', 'Kolar Gold Fields-KA08', 'Koppal-KA37', 'Madhugiri-KA64', 'Madikeri-KA12', 'Malathalli-KA41', 'Malathalli Bangalore-KA61', 'Mandya-KA11', 'Mangalore-KA19', 'Manipal-KA20', 'Mysore East-KA55', 'Mysore West-KA09', 'Nagamangala-KA54', 'Nelamangala-KA52', 'Puttur-KA21', 'R T Nagar-KA60', 'Raichur-KA36', 'Ramanagara-KA42', 'Ramdurg-KA69', 'Ranebennuru-KA68', 'Sagar-KA15', 'Sakaleshpura-KA46', 'Shanthinagar-KA57', 'Shivamogga-KA14', 'Sirsi-KA31', 'Surathkal-KA62', 'Tarikere-KA66', 'Tiptur-KA44', 'Tumakuru-KA06', 'Vijayapura-KA28', 'Yadgir-KA33', 'Yelahanka-KA50']
  },
  'Kerala': {
    districts: [
      'Alappuzha', 'Ernakulam', 'Idukki', 'Kannur', 'Kasaragod', 'Kollam', 'Kottayam', 'Kozhikode',
      'Malappuram', 'Palakkad', 'Pathanamthitta', 'Thiruvananthapuram', 'Thrissur', 'Wayanad'],
    rtoOffices: ['Adoor-KL-26', 'Alappuzha-KL-04', 'Alathur-KL-49', 'Aluva-KL-41', 'Angamaly-KL-63', 'Attingal-KL-16', 'Chadayamangalam-KL-82', 'Chalakkudy-KL-64', 'Changanassery-KL-33', 'Chengannur-KL-30', 'Cherthala-KL-32', 'Chittur-KL-70', 'Devikulam-KL-68', 'Ernakulam-KL-07', 'Guruvayur-KL-46', 'Idukki-KL-06', 'Irinjalakuda-KL-45', 'Iritty-KL-78', 'Kanhangad-KL-60', 'Kanjirappally-KL-34', 'Kannur-KL-13', 'Karunagappalli-KL-23', 'Kasaragod-KL-14', 'Kattakada-KL-74', 'Kayamkulam-KL-29', 'Kazhakootam-KL-22', 'Kodungallur-KL-47', 'Koduvally-KL-57', 'Kollam-KL-02', 'Kondotty-KL-84', 'Konni-KL-83', 'Kothamangalam-KL-44', 'Kottarakkara-KL-24', 'Kottayam-KL-05', 'Koyilandy-KL-56', 'Kozhikode-KL-11', 'Kunnathur-KL-61', 'Kuttanad-KL-66', 'Malappuram-KL-10', 'Mallappally-KL-28', 'Mananthavady-KL-72', 'Mannarkkad-KL-50', 'Mattancherry-KL-43', 'Mavelikkara-KL-31', 'Muvattupuzha-KL-17', 'Nanmanda-KL-76', 'Nationalized Sector-KL-15', 'Nedumangad-KL-21', 'Neyyattinkara-KL-20', 'Nilambur-KL-71', 'North Paravur-KL-42', 'Ottappalam-KL-51', 'Pala-KL-35', 'Palakkad-KL-09', 'Parassala-KL-19', 'Pathanamthitta-KL-03', 'Pathanapuram-KL-80', 'Pattambi-KL-52', 'Payyannur-KL-86', 'Perambra-KL-77', 'Perinthalmanna-KL-53', 'Perumbavoor-KL-40', 'Ponnani-KL-54', 'Punalur-KL-25', 'Ramanattukara Feroke-KL-85', 'Ranni-KL-62', 'Sulthan Bathery-KL-73', 'Thalassery-KL-58', 'Thaliparamba-KL-59', 'Thiruvalla-KL-27', 'Thodupuzha-KL-38', 'Thriprayar-KL-75', 'Thrissur-KL-08', 'Tirur-KL-55', 'Tirurangadi-KL-65', 'Tripunithura-KL-39', 'Trivandrum-KL-01', 'Udumbanchola-KL-69', 'Uzhavoor-KL-67', 'Vaikom-KL-36', 'Vandiperiyar-KL-37', 'Varkala-KL-81', 'Vatakara-KL-18', 'Vellarikundu-KL-79', 'Wadakkancherry-KL-48', 'Wayanad-KL-12']
  },
  'Gujarat': {
    districts: [
      'Ahmedabad', 'Amreli', 'Anand', 'Aravalli', 'Banaskantha', 'Bharuch', 'Bhavnagar', 'Botad',
      'Chhota Udaipur', 'Dahod', 'Dang', 'Devbhoomi Dwarka', 'Gandhinagar', 'Gir Somnath', 'Jamnagar',
      'Junagadh', 'Kheda', 'Kutch', 'Mahisagar', 'Mehsana', 'Morbi', 'Narmada', 'Navsari', 'Panchmahal',
      'Patan', 'Porbandar', 'Rajkot', 'Sabarkantha', 'Surat', 'Surendranagar', 'Tapi', 'Vadodara', 'Valsad'],
    rtoOffices: ['Ahmedabad-GJ01', 'Ahmedabad East-GJ27', 'Ahwa-GJ30', 'Amreli-GJ14', 'Anand-GJ23', 'Bardoli-GJ19', 'Bavla-GJ38', 'Bharuch-GJ16', 'Bhavnagar-GJ04',
      'Bhuj-GJ12', 'Botad-GJ33', 'Chhota Udaipur-GJ34', 'Dahod-GJ20', 'Darjipura-GJ29', 'Gandhinagar-GJ18', 'Godhra-GJ17', 'Himmatnagar-GJ09',
      'Jamnagar-GJ10', 'Junagadh-GJ11', 'Khambhalia-GJ37', 'Lunavada-GJ35', 'Mehsana-GJ02', 'Modasa-GJ31', 'Morbi-GJ36', 'Nadiad-GJ07', 'Navsari-GJ21',
      'Pal Surat-GJ28', 'Palanpur-GJ08', 'Patan-GJ24', 'Porbandar-GJ25', 'Rajkot-GJ03', 'Rajpipla-GJ22', 'Surat-GJ05', 'Surendranagar-GJ13',
      'Vadodara-GJ06', 'Valsad-GJ15', 'Veraval-GJ32', 'Vyara-GJ26']
  },
  'Uttar Pradesh': {
    districts: [
      'Agra', 'Aligarh', 'Ambedkar Nagar', 'Amethi', 'Amroha', 'Auraiya', 'Ayodhya', 'Azamgarh', 'Baghpat',
      'Bahraich', 'Ballia', 'Balrampur', 'Banda', 'Barabanki', 'Bareilly', 'Basti', 'Bhadohi', 'Bijnor', 'Budaun',
      'Bulandshahr', 'Chandauli', 'Chitrakoot', 'Deoria', 'Etah', 'Etawah', 'Farrukhabad', 'Fatehpur', 'Firozabad',
      'Gautam Buddh Nagar', 'Ghaziabad', 'Ghazipur', 'Gonda', 'Gorakhpur', 'Hamirpur', 'Hapur', 'Hardoi', 'Hathras',
      'Jalaun', 'Jaunpur', 'Jhansi', 'Kannauj', 'Kanpur Dehat', 'Kanpur Nagar', 'Kasganj', 'Kaushambi', 'Kheri',
      'Kushinagar', 'Lalitpur', 'Lucknow', 'Maharajganj', 'Mahoba', 'Mainpuri', 'Mathura', 'Mau', 'Meerut', 'Mirzapur',
      'Moradabad', 'Muzaffarnagar', 'Pilibhit', 'Pratapgarh', 'Prayagraj', 'Rae Bareli', 'Rampur', 'Saharanpur',
      'Sambhal', 'Sant Kabir Nagar', 'Shahjahanpur', 'Shamli', 'Shrawasti', 'Siddharthnagar', 'Sitapur', 'Sonbhadra',
      'Sultanpur', 'Unnao', 'Varanasi'],
    rtoOffices: ['Agra-UP80', 'Akbarpur-UP45', 'Aligarh-UP81', 'Allahabad-UP70', 'Amethi-UP36', 'Amroha-UP23', 'Auraiya-UP79', 'Ayodhya-UP42', 'Azamgarh-UP50',
      'BAGHPAT-UP17', 'Badaun-UP24', 'Bahraich-UP40', 'Ballia-UP60', 'Balrampur-UP47', 'Banda-UP90', 'Barabanki-UP41', 'Bareilly-UP25', 'Basti-UP51',
      'Bhadohi-UP66', 'Bijnor-UP20', 'Bulandshahr-UP13', 'Chandauli-UP67', 'Chitrakoot Dham-UP96', 'Deoria-UP52', 'Etah-UP82', 'Etawah-UP75',
      'Farrukhabad-UP76', 'Fatehpur-UP71', 'Firozabad-UP83', 'Ghaziabad-UP14', 'Ghazipur-UP61', 'Gonda-UP43', 'Gorakhpur-UP53', 'Hamirpur-UP91',
      'Hapur-UP37', 'Hardoi-UP30', 'Hathras-UP86', 'Jaunpur-UP62', 'Jhansi-UP93', 'Kannauj-UP74', 'Kanpur-UP78', 'Kanpur Dehat-UP77', 'Kasganj-UP87',
      'Kaushambi-UP73', 'Lakhimpur Kheri-UP31', 'Lalitpur-UP94', 'Lucknow-UP32', 'Mahoba-UP95', 'Mahrajganj-UP56', 'Mainpuri-UP84', 'Mathura-UP85',
      'Mau-UP54', 'Meerut-UP15', 'Mirzapur-UP63', 'Moradabad-UP21', 'Muzaffarnagar-UP12', 'Noida-UP16', 'Orai-UP92', 'Padrauna-UP57',
      'Pilibhit-UP26', 'Pratapgarh-UP72', 'Raebareli-UP33', 'Rampur-UP22', 'Saharanpur-UP11', 'Sambhal-UP38', 'Sant Kabir Nagar-UP58', 'Shahjahanpur-UP27',
      'Shamli-UP19', 'Shravasti-UP46', 'Siddharthnagar-UP55', 'Sitapur-UP34', 'Sonbhadra-UP64', 'Sultanpur-UP44', 'Unnao-UP35', 'Varanasi-UP65']
  },
  'Rajasthan': {
    districts: [
      'Ajmer', 'Alwar', 'Banswara', 'Baran', 'Barmer', 'Bharatpur', 'Bhilwara', 'Bikaner', 'Bundi',
      'Chittorgarh', 'Churu', 'Dausa', 'Dholpur', 'Dungarpur', 'Hanumangarh', 'Jaipur', 'Jaisalmer', 'Jalore', 'Jhalawar',
      'Jhunjhunu', 'Jodhpur', 'Karauli', 'Kota', 'Nagaur', 'Pali', 'Pratapgarh', 'Rajsamand', 'Sawai Madhopur', 'Sikar',
      'Sirohi', 'Tonk', 'Udaipur'],
    rtoOffices: ['Abu Road-RJ38', 'Ajmer-RJ01', 'Alwar-RJ02', 'Balotra-RJ39', 'Banswara-RJ03', 'Baran-RJ28', 'Barmer-RJ04', 'Beawar-RJ36', 'Bharatpur-RJ05',
      'Bhilwara-RJ06', 'Bhinmal-RJ46', 'Bhiwadi-RJ40', 'Bikaner-RJ07', 'Bundi-RJ08', 'Chittorgarh-RJ09', 'Chomu-RJ41', 'Churu-RJ10', 'Dausa-RJ29',
      'Dholpur-RJ11', 'Didwana-RJ37', 'Dudu-RJ47', 'Dungarpur-RJ12', 'Hanumangarh-RJ31', 'Jaipur Jhalana-RJ14', 'Jaipur North-RJ45', 'Jaisalmer-RJ15',
      'Jalore-RJ16', 'Jhalawar-RJ17', 'Jhunjhunu-RJ18', 'Jodhpur-RJ19', 'Karauli-RJ34', 'Kekri-RJ48', 'Khetri-RJ53', 'Kishangarh-RJ42', 'Kota-RJ20',
      'Kotputli-RJ32', 'Nagaur-RJ21', 'Nohar-RJ49', 'Nokha-RJ50', 'Pali-RJ22', 'Phalodi-RJ43', 'Pipar city-RJ54', 'Pokhran-RJ55', 'Pratapgarh-RJ35',
      'Rajsamand-RJ30', 'Ramganjmandi-RJ33', 'Sadulshahar-RJ56', 'Sawai Madhopur-RJ25', 'Shahpura-RJ52', 'Shahpura-RJ51', 'Sikar-RJ23', 'Sirohi-RJ24',
      'Sri Ganganagar-RJ13', 'Sujangarh-RJ44', 'Sumerpur-RJ57', 'Tonk-RJ26', 'Udaipur-RJ27']
  },
  'West Bengal': {
    districts: [
      'Alipurduar', 'Bankura', 'Birbhum', 'Cooch Behar', 'Dakshin Dinajpur', 'Darjeeling', 'Hooghly', 'Howrah',
      'Jalpaiguri', 'Jhargram', 'Kalimpong', 'Kolkata', 'Malda', 'Murshidabad', 'Nadia', 'North 24 Parganas',
      'Paschim Bardhaman', 'Purba Bardhaman', 'Purba Medinipur', 'Purulia', 'South 24 Parganas', 'Uttar Dinajpur'],
    rtoOffices: ['Alipore-WB20', 'Alipore-WB19', 'Alipurduar-WB70', 'Alipurduar-WB69', 'Asansol-WB38', 'Asansol-WB37', 'Bahrampur-WB58', 'Bahrampur-WB57',
      'Balurghat-WB62', 'Balurghat-WB61', 'Bankura-WB68', 'Bankura-WB67', 'Barasat-WB26', 'Barasat-WB25', 'Bardhaman-WB42', 'Bardhaman-WB41',
      'Barrackpore-WB24', 'Barrackpore-WB23', 'Baruipur-WB96', 'Baruipur-WB95', 'Basirhat-WB21', 'Basirhat-WB22', 'Behala-WB10', 'Behala-WB09',
      'Birbhum-WB54', 'Birbhum-WB53', 'Bishnupur-WB87', 'Bishnupur-WB88', 'Bolpur-WB48', 'Bolpur-WB47', 'Bongaon-WB27', 'Bongaon-WB28',
      'Chanchal-WB84', 'Chanchal-WB83', 'Contai-WB32', 'Contai-WB31', 'Cooch Behar-WB64', 'Cooch Behar-WB63', 'Darjeeling-WB77', 'Darjeeling-WB76',
      'Diamond Harbour-WB98', 'Diamond Harbour-WB97', 'Durgapur-WB40', 'Durgapur-WB39', 'Ghatal-WB50', 'Hooghly Chinsurah-WB16', 'Hooghly Chinsurah-WB15',
      'Howrah-WB12', 'Howrah-WB11', 'Islampur-WB92', 'Islampur-WB91', 'Jalpaiguri-WB72', 'Jalpaiguri-WB71', 'Jangipur-WB94', 'Jangipur-WB93',
      'Jaynagar-WB99', 'Jhargram-WB49', 'Kalimpong-WB79', 'Kalimpong-WB78', 'Kalna-WB44', 'Kalna-WB43', 'Kalyani-WB90', 'Kalyani-WB89',
      'Kasba-WB06', 'Kasba-WB05', 'Katwa-WB75', 'Kharagpur-WB36', 'Kharagpur-WB35', 'Malda-WB66', 'Malda-WB65', 'Mathabhanga-WB86', 'Mathabhanga-WB85',
      'Midnapore-WB34', 'Midnapore-WB33', 'Nadia-WB51', 'PVD Beltala-WB04', 'PVD Beltala-WB03', 'PVD Beltala-WB02', 'PVD Beltala-WB01',
      'Purulia-WB56', 'Purulia-WB55', 'Raghunathpur-WB81', 'Raghunathpur-WB82', 'Raiganj-WB60', 'Raiganj-WB59', 'Rampurhat-WB46', 'Rampurhat-WB45',
      'Salt Lake-WB08', 'Salt Lake-WB07', 'Serampore-WB18', 'Serampore-WB17', 'Siliguri-WB74', 'Siliguri-WB73', 'Tamluk-WB30', 'Tamluk-WB29',
      'Tehatta-WB52', 'Uluberia-WB14', 'Uluberia-WB13']
  },
  'Bihar': {
    districts: [
      'Araria', 'Arwal', 'Aurangabad', 'Banka', 'Begusarai', 'Bhagalpur', 'Bhojpur', 'Buxar', 'Darbhanga',
      'East Champaran', 'Gaya', 'Gopalganj', 'Jamui', 'Jehanabad', 'Kaimur', 'Katihar', 'Khagaria',
      'Kishanganj', 'Lakhisarai', 'Madhepura', 'Madhubani', 'Munger', 'Muzaffarpur', 'Nalanda', 'Nawada',
      'Patna', 'Purnia', 'Rohtas', 'Saharsa', 'Samastipur', 'Saran', 'Sheikhpura', 'Sheohar', 'Sitamarhi', 'Siwan',
      'Supaul', 'Vaishali', 'West Champaran'],
    rtoOffices: ['Araria-BR38', 'Arawal-BR56', 'Aurangabad-BR26', 'Banka-BR51', 'Begusarai-BR09', 'Bettiah-BR22', 'Bhabhua-BR45', 'Bhagalpur-BR10',
      'Bhojpur-BR03', 'Buxur-BR44', 'Chapara-BR04', 'Darbhanga-BR07', 'Gaya-BR02', 'Gopalganj-BR28', 'Jamui-BR46', 'Jehanabad-BR25', 'Katihar-BR39',
      'Khagaria-BR34', 'Kishanganj-BR37', 'Lakhisarai-BR53', 'Madhepura-BR43', 'Madhubani-BR32', 'Motihari-BR05', 'Munger-BR08', 'Muzaffarpur-BR06',
      'Nalanda-BR21', 'Nawada-BR27', 'Patna-BR01', 'Purnea-BR11', 'Rohtas-BR57', 'Rohtas-BR24', 'Saharsa-BR19', 'Samastipur-BR33', 'Sheikhpura-BR52',
      'Sheohar-BR55', 'Sitamarhi-BR30', 'Siwan-BR29', 'Supaul-BR50', 'Vaishali-BR31']
  }
};

function makeSubmenu(value) {
  if (value.length == 0) {
    document.getElementById('rtoOffice').innerHTML = '<option value="" selected>Select</option>';
    document.getElementById('district').innerHTML = '<option value="" selected>Select</option>';
  }
  else {
    var rtoOfficesOptions = '';
    var districtsOptions = '';
    for (var i = 0; i < data[value].rtoOffices.length; i++) {
      rtoOfficesOptions += "<option>" + data[value].rtoOffices[i] + "</option>";
    }
    for (var i = 0; i < data[value].districts.length; i++) {
      districtsOptions += "<option>" + data[value].districts[i] + "</option>";
    }
    document.getElementById('rtoOffice').innerHTML = '<option value="" selected>Select</option>' + rtoOfficesOptions;
    document.getElementById('district').innerHTML = '<option value="" selected>Select</option>' + districtsOptions;
  }
}

function copyPresentAddress() {
  const sameAddress = document.getElementById("sameAddress");
  const presentAddress = document.getElementById("presentAddress").value;
  const permanentAddress = document.getElementById("permanentAddress");
  const presentPincode = document.getElementById("presentPincode").value;
  const permanentPincode = document.getElementById("permanentPincode");
  if (sameAddress.checked) {
    permanentAddress.value = presentAddress;
    permanentPincode.value = presentPincode;
  } else {
    permanentAddress.value = "";
    permanentPincode.value = "";
  }
}

function handleFirst() {
  const fname = document.getElementById("firstName").value;
  const sub = document.getElementById("submit");
  if (fname.length < 3 || fname.length > 20) {
    document.getElementById("fnmsg").innerHTML = "<span style='color: red'>Firstname: 3-20 characters required</span>";
    sub.disabled = true;
  } else {
    document.getElementById("fnmsg").innerHTML = "<span style='color: green'>Firstname is valid</span>";
    sub.disabled = false;
  }
  if (fname.length === 0) {
    document.getElementById("fnmsg").innerHTML = "";
  }
}

function handleMiddle() {
  const mname = document.getElementById("middleName").value;
  const sub = document.getElementById("submit");
  if (mname.length > 6) {
    document.getElementById("mnmsg").innerHTML = "<span style='color: red'>Middlename: max 6 characters</span>";
    sub.disabled = true;
  } else {
    document.getElementById("mnmsg").innerHTML = "<span style='color: green'>Middlename is valid</span>";
    sub.disabled = false;
  }
  if (mname.length === 0) {
    document.getElementById("mnmsg").innerHTML = "";
  }
}

function handleLast() {
  const lname = document.getElementById("lastName").value;
  const sub = document.getElementById("submit");
  if (lname.length > 6) {
    document.getElementById("lnmsg").innerHTML = "<span style='color: red'>Lastname: Max 6 characters</span>";
    sub.disabled = true;
  } else {
    document.getElementById("lnmsg").innerHTML = "<span style='color: green'>Lastname is valid</span>";
    sub.disabled = false;
  }
  if (lname.length === 0) {
    document.getElementById("lnmsg").innerHTML = "";
  }
}

function handleAge() {
  const userAge = document.getElementById("age").value;
  const sub = document.getElementById("submit");
  if (userAge < 18) {
    document.getElementById("agmsg").innerHTML = "<span style='color: red'>Minimum age: 18</span>";
    sub.disabled = true;
  } else {
    document.getElementById("agmsg").innerHTML = "<span style='color: green'>Age is Valid</span>";
    sub.disabled = false;
  }
}

function handleEmail() {
  const em = document.getElementById("emailAddress").value;
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

function handlePhone() {
  const ph = document.getElementById("phoneNumber").value;
  const sub = document.getElementById("submit");
  if (ph.length !== 10) {
    document.getElementById("phmsg").innerHTML = "<span style='color: red'>PhoneNumber: 10 digits required</span>";
    sub.disabled = true;
  } else {
    document.getElementById("phmsg").innerHTML = "<span style='color: green'>Phonenumber is valid</span>";
    sub.disabled = false;
  }
  if (ph.length === 0) {
    document.getElementById("phmsg").innerHTML = "";
  }
}

// function handleAlternatePhone() {
//   const alph = document.getElementById("alternatePhoneNumber").value;
//   const ph = document.getElementById("phoneNumber").value;
//   const sub = document.getElementById("submit");
//   if (alph.length !== 10) {
//     document.getElementById("alphmsg").innerHTML = "<span style='color: red'>Alternatenumber: 10 digits required</span>";
//     sub.disabled = true;
//   } else if (alph === ph) {
//     document.getElementById("alphmsg").innerHTML = "<span style='color: red'>Alternatenumber must differ from PhoneNumber</span>";
//     sub.disabled = true;
//   } else {
//     document.getElementById("alphmsg").innerHTML = "<span style='color: green'>Alternatenumber is valid</span>";
//     sub.disabled = false;
//   }
//   if (alph.length === 0) {
//     document.getElementById("alphmsg").innerHTML = "";
//   }
// }

function handlePresentAdd() {
  const presadd = document.getElementById("presentAddress").value;
  const sub = document.getElementById("submit");
  if (presadd.length === 0) {
    document.getElementById("presaddmsg").innerHTML = "";
    sub.disabled = true;
  } else {
    document.getElementById("presaddmsg").innerHTML = "<span style='color: green'>Presentaddress is valid</span>";
    sub.disabled = false;
  }
}

function handlePresentPin() {
  const prespin = document.getElementById("presentPincode").value;
  const sub = document.getElementById("submit");
  if (prespin.length !== 6) {
    document.getElementById("prespinmsg").innerHTML = "<span style='color: red'>Pincode: 6 digits required</span>";
    sub.disabled = true;
  } else {
    document.getElementById("prespinmsg").innerHTML = "<span style='color: green'>Pincode is valid</span>";
    sub.disabled = false;
  }
  if (prespin.length === 0) {
    document.getElementById("prespinmsg").innerHTML = "";
  }
}

function handlePermanentAdd() {
  const permadd = document.getElementById("permanentAddress").value;
  const sub = document.getElementById("submit");
  if (permadd.length === 0) {
    document.getElementById("permaddmsg").innerHTML = "";
    sub.disabled = true;
  } else {
    document.getElementById("permaddmsg").innerHTML = "<span style='color: green'>Permanentaddress is valid</span>";
    sub.disabled = false;
  }
}

function handlePermanentPin() {
  const permpin = document.getElementById("permanentPincode").value;
  const sub = document.getElementById("submit");
  if (permpin.length !== 6) {
    document.getElementById("permpinmsg").innerHTML = "<span style='color: red'>Pincode: 6 digits required</span>";
    sub.disabled = true;
  } else {
    document.getElementById("permpinmsg").innerHTML = "<span style='color: green'>Pincode is valid</span>";
    sub.disabled = false;
  }
  if (permpin.length === 0) {
    document.getElementById("permpinmsg").innerHTML = "";
  }
}

function handleAadhar() {
  const adno = document.getElementById("aadharNumber").value;
  const sub = document.getElementById("submit");
  if (adno.length !== 12) {
    document.getElementById("admsg").innerHTML = "<span style='color: red'>Aadharnumber: 12 digits required</span>";
    sub.disabled = true;
  } else {
    document.getElementById("admsg").innerHTML = "<span style='color: green'>Aadharnumber is valid</span>";
    sub.disabled = false;
  }
  if (adno.length === 0) {
    document.getElementById("admsg").innerHTML = "";
  }
}