function gainAccess(event){
  const curElement=event.target
  var value = curElement.innerHTML
  var prevalue=textbox.value
  if(value=="="){
    const res=eval(prevalue)
    textbox.value=res
  }
  else if(value=="AC"){
    textbox.value=""
  }
  else if(value=="C"){
    textbox.value=prevalue.slice(0,-1)
  }
  else{
    console.log(prevalue);
    textbox.value=prevalue+""+value
  }

}

const boxes = document.querySelectorAll("button");
console.log(boxes);

for(const element of boxes){
  element.addEventListener("click",gainAccess);
}

const textbox = document.getElementById("input");
