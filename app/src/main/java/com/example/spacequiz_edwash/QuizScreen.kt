package com.example.spacequiz_edwash

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//Correct Answers
val ansList = listOf("Jupiter", "Mars", "The Sun", "Milky Way Galaxy", "8 minutes", "Sputnik 1", "The distance light travels in one year")
// Index
var idx = 0
//Total Correct Answers
var totalCorrect = 0

@Composable
fun QuizScreen(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}
    // Initializing variables
    idx = 0
    totalCorrect = 0


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 1",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "What is the largest planet in our solar system?",
            radioOptions = listOf("Earth", "Mars", "Jupiter", "Saturn"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("quiz_screen2")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun QuizScreen2(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 2",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "Which planet is know as the \"Red Planet\"",
            radioOptions = listOf("Venus", "Mars", "Mercury", "Neptune"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("quiz_screen3")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun QuizScreen3(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 3",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "What celestial object is at the center of our solar system?",
            radioOptions = listOf("The Moon", "A Black Hole", "The Sun", "A Nebula"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("quiz_screen4")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun QuizScreen4(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 4",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "Which galaxy is the Earth located in?",
            radioOptions = listOf("Andromeda Galaxy", "Sombrero Galaxy", "Triangulum Galaxy", "Milky Way Galaxy"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("quiz_screen5")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun QuizScreen5(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 5",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "How long does it take for light from the Sun to reach Earth?",
            radioOptions = listOf("8 seconds", "8 minutes", "1 hour", "24 hours"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("quiz_screen6")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun QuizScreen6(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 6",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "What is the name of the first human-made satellite to orbit the Earth?",
            radioOptions = listOf("Sputnik 1", "Voyager 1", "Apollo 11", "Hubble Space Telescope"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("quiz_screen7")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun QuizScreen7(navController: NavController, context: Context){
    //User Selected Answer
    var selectedAns by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Question 7",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        RadioGroup(
            labelText = "What is a light-year?",
            radioOptions = listOf("The time it takes for light to travel around the Sun", "A measurement of how bright a star is", "The distance between the Earth and the Moon", "The distance light travels in one year"),
            selectedOption = selectedAns,
            onSelected = { selectedAns = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            onClick = { if(isCorrect(selectedAns)){
                Toast.makeText(context, "The answer is correct", Toast.LENGTH_SHORT).show()
                totalCorrect++
            } else{
                Toast.makeText(context, "The answer is wrong", Toast.LENGTH_SHORT).show()
            }
                navController.navigate("final_screen")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirm")
        }

    }

}

@Composable
fun FinalScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {Text(
        text = "Game Over!",
        fontSize = 38.sp,
        modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Here are you statistics",
            fontSize = 38.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Amount Correct",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "$totalCorrect/7",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            color = Color.Blue
        )
        Button(onClick = {navController.navigate("quiz_screen")},
            modifier = Modifier.fillMaxWidth())
        {
            Text("Play Again")
        }

    }
}

fun isCorrect(userAns:String) : Boolean{
    if(ansList[idx] == userAns){
        idx++
        return true
    } else{
        idx++
        return false
    }
}


@Composable
fun RadioGroup(
    labelText: String,
    radioOptions: List<String>,
    selectedOption: String,
    onSelected: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val isSelectedOption: (String) -> Boolean = { selectedOption == it }

    Column {
        Text(labelText)
        radioOptions.forEach { option ->
            //Highlight selected answers green
            val backgroundColor = if (isSelectedOption(option)) Color.Green else Color.Transparent
            Row(
                modifier = modifier
                    .selectable(
                        selected = isSelectedOption(option),
                        onClick = { onSelected(option)},
                        role = Role.RadioButton
                    )
                    .background(backgroundColor)
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = isSelectedOption(option),
                    onClick = null,
                    modifier = modifier.padding(end = 8.dp)
                )
                Text(
                    text = option,
                    modifier = modifier.fillMaxWidth()
                )
            }
        }
    }
}