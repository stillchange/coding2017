package me.lzb.jvm.constant;

/**
 * Created by LZB on 2017/4/14.
 */
public class ClassInfo extends ConstantInfo{
    private int type = JvmConstant.Class_info;
    private int utf8Index;

    public ClassInfo(ConstantPool pool) {
        super(pool);
    }

    @Override
    public int getType() {
        return type;
    }

    public int getUtf8Index() {
        return utf8Index;
    }

    public void setUtf8Index(int utf8Index) {
        this.utf8Index = utf8Index;
    }


    public String getClassName() {
        int index = getUtf8Index();
        UTF8Info utf8Info = (UTF8Info)constantPool.getConstantInfo(index);
        return utf8Info.getValue();
    }
}
