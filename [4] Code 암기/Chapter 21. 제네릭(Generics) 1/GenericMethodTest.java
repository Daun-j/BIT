����   4 A  _0603/GenericMethodTest  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this L_0603/GenericMethodTest; main ([Ljava/lang/String;)V  Sweet
    _0603/BoxFactory   makeBox (Ljava/lang/Object;)L_0603/Box;@\(�\
    java/lang/Double   valueOf (D)Ljava/lang/Double;	 ! # " java/lang/System $ % out Ljava/io/PrintStream;
 ' ) ( 	_0603/Box * + get ()Ljava/lang/Object; - java/lang/String
 / 1 0 java/io/PrintStream 2 3 println (Ljava/lang/String;)V
 / 5 2 6 (Ljava/lang/Object;)V args [Ljava/lang/String; sBox L_0603/Box; dBox LocalVariableTypeTable L_0603/Box<Ljava/lang/String;>; L_0603/Box<Ljava/lang/Double;>; 
SourceFile GenericMethodTest.java !               /     *� �    
                    	       �     (� L � � M�  +� &� ,� .�  ,� &� 4�    
               ' "         ( 7 8    " 9 :    ; :  <      " 9 =    ; >   ?    @