package com.grooby

import lombok.Data

@Data
class RbmsVo {
    String plcd
    String grpNo
    String plicd
    String basePlicdYn

    /**
     * 테스트 커밋 소스
     * 테스트 폴 소스!
     * @param plcd
     * @param grpNo
     * @param plicd
     * @param basePlicdYn
     */
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
