package com.grooby

import lombok.Data

@Data
class RbmsVo {
    String plcd
    String grpNo
    String plicd
    String basePlicdYn

    RbmsVo(String plcd, String grpNo, String plicd, String basePlicdYn) {
        this.plcd = plcd
        this.grpNo = grpNo
        this.plicd = plicd
        this.basePlicdYn = basePlicdYn
    }


    @Override
    public String toString() {
        return "RbmsVo{" +
                "plcd='" + plcd + '\'' +
                ", grpNo='" + grpNo + '\'' +
                ", plicd='" + plicd + '\'' +
                ", basePlicdYn='" + basePlicdYn + '\'' +
                '}';
    }
}
