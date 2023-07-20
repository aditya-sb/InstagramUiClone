package com.example.instaprofileclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(){
    Column {
        TopBar(profileName = "Aditya_bhadouria__")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp))
        ProfileSection()
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Description(name = "Aditya Bhadouria", bio = "no bio maths lia hai XD \n APK abdul kalam")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        ButtonEdit(name = "Edit Profile")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Stories()
    }

}
@Composable
fun TopBar(profileName: String,modifier: Modifier = Modifier){
    Row(verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)) {
        Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription =null )
        Text(text = profileName, style = TextStyle(fontSize = 20.sp))
        Icon(painter = painterResource(id = R.drawable.baseline_notifications_24), contentDescription =null )
        Icon(painter = painterResource(id = R.drawable.baseline_more_vert_24), contentDescription =null )
    }
}

@Composable
fun ProfileSection(){
    Column(Modifier.padding(horizontal = 10.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            RoundImage(image = painterResource(id = R.drawable.person), widthSize = 120 )
            Number(boxName ="Post", boxNumber = "2")
            Number(boxName ="Followers", boxNumber = "333")
            Number(boxName ="Following", boxNumber = "108")
        }
    }
}

@Composable
fun RoundImage(image: Painter,modifier:Modifier=Modifier,widthSize: Int){
    Image(painter = image, contentDescription =null,modifier =
    Modifier
        .width(widthSize.dp)
        .aspectRatio(1f, matchHeightConstraintsFirst = true)
        .border(
            2.dp, shape = CircleShape,
            color = Color.LightGray
        )
        .clip(CircleShape))
}

@Composable
fun Number(boxName:String,boxNumber:String){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = boxNumber, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = boxName,  fontWeight = FontWeight.Bold, fontSize = 20.sp)
    }

}

@Composable
fun Description(name:String,bio:String){
    Column(modifier = Modifier.padding(horizontal = 10.dp)) {
        Text(text = name, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = bio, fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
    }

}

@Composable
fun ButtonEdit(name: String){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp)){
        OutlinedButton(onClick = { /*TODO*/ }
             ,modifier = Modifier.fillMaxWidth()
        ){
                Text(text = "name", color = Color.Black, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun Stories(){
    Row() {
        RoundImage(image = painterResource(id = R.drawable.person), widthSize = 70)
        RoundImage(image = painterResource(id = R.drawable.person), widthSize = 70)
        RoundImage(image = painterResource(id = R.drawable.person), widthSize = 70)
        RoundImage(image = painterResource(id = R.drawable.person), widthSize = 70)
    }
}