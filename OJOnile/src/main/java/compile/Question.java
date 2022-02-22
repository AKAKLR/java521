package compile;

// 用这个类来表示一个 task 的输入内容
// 会包含要编译的代码
public class Question {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}