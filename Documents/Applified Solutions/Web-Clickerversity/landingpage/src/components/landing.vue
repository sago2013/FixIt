<template>
  <v-app>
  <v-content class="landing tealback">
    <v-container>
    <v-flex xs10 class="nice">
      <img src="../assets/logo_white.png" style='height: 100%; width: 100%; object-fit: contain'/>
      <!--<img class="pt-5 mb-0 cimag" src="../assets/clickerversity.png">-->
    </v-flex>
    <v-flex xs12 class="ma-0">
        <!--<img src="../assets/land_bg.png" height="100" width="325" >-->
      <div class="title" style="color:#ffffff">
        <p class="text-xs-center title pa-0 ma-0 pb-1 mt-1"><b>Clickerversity is an innovative lecture</b></p>
        <p class="text-xs-center title pa-0 ma-0 pb-1 mt-1"><b>retainment platform currently in</b></p>
        <p class="text-xs-center title pa-0  ma-0 pb-1 mt-1 "><b>development by Applified Solutions</b></p></div>
      <div class="display-1 mb-3 mt-4" style="color:#607D8B"><b>Interested in what we are building?</b></div>
        <form action="https://formspree.io/applified.solutions@gmail.com" method="POST">
          <v-layout row wrap class="mx-auto">
            <v-flex>
              <input id="email" type="email" name="_replyto" placeholder="Your email">
            </v-flex>
            <v-flex>
              <v-select chips class="dropbtn" color="teal darken-2" label="I am interested in ..." v-model="university" autocomplete :items='unis'></v-select>
            </v-flex>
          </v-layout>
          <input type="hidden"  id="subject" name="message" :value="university">


      <v-spacer></v-spacer>
      <v-btn outline class="sexy" color="shades white"  type="submit" value="Send" ><input type="submit" value="Notify Me!"></v-btn>
      </form>
    </v-flex>
    <div class="fixed-bottom auto" >
      <div class="auto"><a href="http://applified.solutions"><img src="../assets/aslogo.png" height="100" width="200"></a></div>
    </div>
    {{university}}
</v-container>
</v-content>
</v-app>
</template>

<script>
export default {
  name: 'Landing',
  data () {
    return {
      university: '',
      unis: [
        'Participating in the Clickerversity Beta', 'Learning more about Clickerversity', 'Getting notified about exciting updates and news',
        'Joining the Applified Solutions Team',

      ],
    }
  }
}
</script>

<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
.tealback  {
    background-image: url(https://scontent-ort2-2.xx.fbcdn.net/v/t1.0-9/31775971_10155496656891149_4845533037640810496_n.jpg?_nc_cat=0&oh=aac2bcdd1febda4671999a377e23658f&oe=5B9B2B2C)/*'../assets/land_bg.png'*/;
    background-repeat: repeat;

  /*background-color: #cccccc;*/
}
.dropbtn {
    background-color:rgba(225,225,225,0.6);
    cursor: pointer;
    border: 3px solid rgba(225,225,225,0.6);
    height: 60px;

}
.auto{
  margin-right: 1000px;
  padding-left: 10px;
  padding-top: 115px;
  padding-bottom: 10px;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn:hover {
    border: 3px solid #555;

}
input[type=email]:focus {
    border: 3px solid #555;
}
input[type=email]:hover {
    border: 3px solid #555;
}
input[type=email] {
    background-color:rgba(225,225,225,0.6);
    box-sizing: border-box;
    border: 3px solid rgba(225,225,225,0.6);
    -webkit-transition: 0.5s;
    transition: 0.5s;
    height: 60px;
    width: 350px;
    margin-bottom: 10px;
}
.sexy{
  border-radius: 10px;
  border-width: 1.5px;
  margin-top: 15px;
  padding-bottom: 5px;
  width: 200px;
  height: 40px;
}

.nice {
  margin-left: auto;
  margin-right: auto;
  padding-top: 20px;
  padding-bottom: 0px;
  margin-bottom: 0px;
}

</style>
