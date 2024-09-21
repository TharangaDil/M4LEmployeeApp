import { StyleSheet, Text, View,Image,Button,TouchableOpacity} from 'react-native';


export default function Main({navigation}){
    return(
        <View >
            <Text style={styles.t1}>M4L </Text>
            <Text style={styles.t2}>Maldives PVT LTD</Text>
         
            <TouchableOpacity style={styles.btn}>
                <Text style={styles.txt} onPress={() => navigation.navigate('Dashboard')}>SIGNUP</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.btn2}>
                <Text style={styles.txt}>LOGIN</Text>
            </TouchableOpacity>
    
        </View>
    )
}

const styles=StyleSheet.create({
   t1:{
    paddingTop:70,
    fontSize:96,
    paddingLeft:25
  
   },
   t2:{
    fontSize:36,
    fontStyle:'italic',
    paddingLeft:50
   },
   btn: {
    backgroundColor: '#053119',
    padding: 10,
    margin: 10,
    borderRadius: 5,
    alignItems: 'center',
    marginTop:400,
    borderRadius:40
  },
  btn2: {
    backgroundColor: '#053119',
    padding: 10,
    margin: 10,
    borderRadius: 5,
    alignItems: 'center',
    marginTop:5,
    borderRadius:40
  },
  txt:{
    fontSize:18,
    color:'white',
    
  }

})