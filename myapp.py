import streamlit as st
st.title("My App")

st.write("Welcome to my app")

name=st.text_input("what's your name")

if name:
    st.success(f"Greetings, {name}")

number=st.slider("choose numer",0,100,50)
st.write("your number is:",number )