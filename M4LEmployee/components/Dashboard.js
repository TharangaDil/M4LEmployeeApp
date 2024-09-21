import { StyleSheet, Text, View,Image } from 'react-native';
export default function Dashboard(){
    return(
        <View style={styles.content}>
            <Image style={styles.img} resizeMode='contain'source={require('../img/logo.png')}/>
           <Text>Email</Text>
           <Text>User Name</Text>
           <Text>Password</Text>
           <Text>Confirm Password</Text>
            
        </View>
    )
}

const styles=StyleSheet.create({
    img:{
        width:300,
        height:100,
        marginLeft:150
    }
})