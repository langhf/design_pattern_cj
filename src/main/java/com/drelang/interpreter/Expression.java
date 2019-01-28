package com.drelang.interpreter;

/**
  *  抽象表达式类
  * Created by Drelang on 2019/01/28
  */
public abstract class Expression {

    /**
     * 解释器
     * @param context 被解释的文本
     */
    public void interpret(PlayContext context) {
        if( context.getText().length() == 0 ) {
            return ;
        }
        else {
            /*
                  例如: O 3 E 0.5 G 0.5 A 3
                  则 playKey 为 O, 而 playValue 为 3, 并且原文本中删除了这两个字符
             */
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            Double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            execute(playKey, playValue);
        }
    }

    public abstract void execute(String key, Double value);
}
