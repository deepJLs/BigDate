# String和StirngBuffer的互换
//创建一个String对象
14         String str = "Hi Java!";
15         System.out.println(str);
16  
17         //方式一：构造方法
18         StringBuffer buffer = new StringBuffer(str);
19         System.out.println(buffer);
20  
21         //方式二：通过append方法
22         StringBuffer buffer2 = new StringBuffer();
23         buffer2.append(str);
24         System.out.println(buffer2);
25  
26         //StringBuffer -> String
27         //创建一个StringBuffer对象
28         StringBuffer buffer3 = new StringBuffer();
29         buffer3.append("Happy birthday Java!");
30         System.out.println(buffer3);
31  
32         //方式一：通过构造方法
33         String str2 = new String(buffer3); 
34         System.out.println(str2);
35          
36         //方式二：通过toString方法
37         String str3 = buffer3.toString();
38         System.out.println(str3);
39     }
40 }