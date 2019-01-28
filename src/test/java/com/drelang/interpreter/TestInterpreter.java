package com.drelang.interpreter;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试解释器模式
  * Created by Drelang on 2019/01/28
  */
public class TestInterpreter extends AppTest {

    @Test
    public void testInterpreter() {
        PlayContext context = new PlayContext();
        // 音乐-上海滩
        System.out.println("上海滩: ");
        String text = "T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        context.setText(text);
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String key = context.getText().substring(0, 1);
                expression = ExpressionFactory.getExpression(key);
                expression.interpret(context);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
