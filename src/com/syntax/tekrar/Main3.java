package com.syntax.tekrar;


import javax.imageio.stream.ImageInputStream;

public class Main3 {
    public String conCat(String str1, String str2)
    {
        if (str1.length() != 0 && str2.length() != 0
                && str1.charAt(str1.length() - 1) == str2.charAt(0))
            return str1 + str2.substring(1);
        return str1 + str2;





    }

}
