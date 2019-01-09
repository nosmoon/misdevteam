/***************************************************************************************************
* 파일명 : SS_I_OTHRPTDM.java
* 기능 : 정보공유-일지및보고서-타사동향보고 등록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일지및보고서-타사동향보고 등록을 위한 DM
 */

public class SS_I_OTHRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

    public String makedt;
    public String makepersid;
    public String makepersnm;
    public String deptcd;
    public String deptnm;
    public String jungpoly;
    public String jungmovmt;
    public String jungetc;
    public String dongpoly;
    public String dongmovmt;
    public String dongetc;
    public String etcpoly;
    public String etcmovmt;
    public String etcetc;
    public String filenm;
    public String filesize;
    public byte[] filecont;
    public String incmgpers;
    public Timestamp incmgdt;

    public SS_I_OTHRPTDM(){}
    public SS_I_OTHRPTDM(String makedt, String makepersid, String makepersnm, String deptcd, String deptnm, String jungpoly, String jungmovmt, String jungetc, String dongpoly, String dongmovmt, String dongetc, String etcpoly, String etcmovmt, String etcetc, String filenm, String filesize, byte[] filecont, String incmgpers, Timestamp incmgdt){
        this.makedt = makedt;
        this.makepersid = makepersid;
        this.makepersnm = makepersnm;
        this.deptcd = deptcd;
        this.deptnm = deptnm;
        this.jungpoly = jungpoly;
        this.jungmovmt = jungmovmt;
        this.jungetc = jungetc;
        this.dongpoly = dongpoly;
        this.dongmovmt = dongmovmt;
        this.dongetc = dongetc;
        this.etcpoly = etcpoly;
        this.etcmovmt = etcmovmt;
        this.etcetc = etcetc;
        this.filenm = filenm;
        this.filesize = filesize;
        this.filecont = filecont;
        this.incmgpers = incmgpers;
        this.incmgdt = incmgdt;
    }

    public void setMakedt(String makedt){
        this.makedt = makedt;
    }

    public void setMakepersid(String makepersid){
        this.makepersid = makepersid;
    }

    public void setMakepersnm(String makepersnm){
        this.makepersnm = makepersnm;
    }

    public void setDeptcd(String deptcd){
        this.deptcd = deptcd;
    }

    public void setDeptnm(String deptnm){
        this.deptnm = deptnm;
    }

    public void setJungpoly(String jungpoly){
        this.jungpoly = jungpoly;
    }

    public void setJungmovmt(String jungmovmt){
        this.jungmovmt = jungmovmt;
    }

    public void setJungetc(String jungetc){
        this.jungetc = jungetc;
    }

    public void setDongpoly(String dongpoly){
        this.dongpoly = dongpoly;
    }

    public void setDongmovmt(String dongmovmt){
        this.dongmovmt = dongmovmt;
    }

    public void setDongetc(String dongetc){
        this.dongetc = dongetc;
    }

    public void setEtcpoly(String etcpoly){
        this.etcpoly = etcpoly;
    }

    public void setEtcmovmt(String etcmovmt){
        this.etcmovmt = etcmovmt;
    }

    public void setEtcetc(String etcetc){
        this.etcetc = etcetc;
    }

    public void setFilenm(String filenm){
        this.filenm = filenm;
    }

    public void setFilesize(String filesize){
        this.filesize = filesize;
    }

    public void setFilecont(byte[] filecont){
        this.filecont = filecont;
    }

    public void setIncmgpers(String incmgpers){
        this.incmgpers = incmgpers;
    }

    public void setIncmgdt(Timestamp incmgdt){
        this.incmgdt = incmgdt;
    }

    public String getMakedt(){
        return this.makedt;
    }

    public String getMakepersid(){
        return this.makepersid;
    }

    public String getMakepersnm(){
        return this.makepersnm;
    }

    public String getDeptcd(){
        return this.deptcd;
    }

    public String getDeptnm(){
        return this.deptnm;
    }

    public String getJungpoly(){
        return this.jungpoly;
    }

    public String getJungmovmt(){
        return this.jungmovmt;
    }

    public String getJungetc(){
        return this.jungetc;
    }

    public String getDongpoly(){
        return this.dongpoly;
    }

    public String getDongmovmt(){
        return this.dongmovmt;
    }

    public String getDongetc(){
        return this.dongetc;
    }

    public String getEtcpoly(){
        return this.etcpoly;
    }

    public String getEtcmovmt(){
        return this.etcmovmt;
    }

    public String getEtcetc(){
        return this.etcetc;
    }

    public String getFilenm(){
        return this.filenm;
    }

    public String getFilesize(){
        return this.filesize;
    }

    public byte[] getFilecont(){
        return this.filecont;
    }

    public String getIncmgpers(){
        return this.incmgpers;
    }

    public Timestamp getIncmgdt(){
        return this.incmgdt;
    }

    public String getSQL(){
         return "{ call SP_SS_I_OTHRPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_I_OTHRPTDM dm = (SS_I_OTHRPTDM)bdm;
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.setString(3, dm.makedt);
        cstmt.setString(4, dm.makepersid);
        cstmt.setString(5, dm.makepersnm);
        cstmt.setString(6, dm.deptcd);
        cstmt.setString(7, dm.deptnm);
        cstmt.setString(8, dm.jungpoly);
        cstmt.setString(9, dm.jungmovmt);
        cstmt.setString(10, dm.jungetc);
        cstmt.setString(11, dm.dongpoly);
        cstmt.setString(12, dm.dongmovmt);
        cstmt.setString(13, dm.dongetc);
        cstmt.setString(14, dm.etcpoly);
        cstmt.setString(15, dm.etcmovmt);
        cstmt.setString(16, dm.etcetc);
        cstmt.setString(17, dm.filenm);
        cstmt.setString(18, dm.filesize);
        cstmt.setBytes(19, dm.filecont);
        cstmt.setString(20, dm.incmgpers);
        cstmt.setTimestamp(21, dm.incmgdt);
        cstmt.registerOutParameter(22, Types.VARCHAR);
    }

    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sls.share.ds.SS_I_OTHRPTDataSet();
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String makedt = req.getParameter("makedt");
if( makedt == null){
    System.out.println(this.toString+" : makedt is null" );
}else{
    System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersid = req.getParameter("makepersid");
if( makepersid == null){
    System.out.println(this.toString+" : makepersid is null" );
}else{
    System.out.println(this.toString+" : makepersid is "+makepersid );
}
String makepersnm = req.getParameter("makepersnm");
if( makepersnm == null){
    System.out.println(this.toString+" : makepersnm is null" );
}else{
    System.out.println(this.toString+" : makepersnm is "+makepersnm );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
    System.out.println(this.toString+" : deptcd is null" );
}else{
    System.out.println(this.toString+" : deptcd is "+deptcd );
}
String deptnm = req.getParameter("deptnm");
if( deptnm == null){
    System.out.println(this.toString+" : deptnm is null" );
}else{
    System.out.println(this.toString+" : deptnm is "+deptnm );
}
String jungpoly = req.getParameter("jungpoly");
if( jungpoly == null){
    System.out.println(this.toString+" : jungpoly is null" );
}else{
    System.out.println(this.toString+" : jungpoly is "+jungpoly );
}
String jungmovmt = req.getParameter("jungmovmt");
if( jungmovmt == null){
    System.out.println(this.toString+" : jungmovmt is null" );
}else{
    System.out.println(this.toString+" : jungmovmt is "+jungmovmt );
}
String jungetc = req.getParameter("jungetc");
if( jungetc == null){
    System.out.println(this.toString+" : jungetc is null" );
}else{
    System.out.println(this.toString+" : jungetc is "+jungetc );
}
String dongpoly = req.getParameter("dongpoly");
if( dongpoly == null){
    System.out.println(this.toString+" : dongpoly is null" );
}else{
    System.out.println(this.toString+" : dongpoly is "+dongpoly );
}
String dongmovmt = req.getParameter("dongmovmt");
if( dongmovmt == null){
    System.out.println(this.toString+" : dongmovmt is null" );
}else{
    System.out.println(this.toString+" : dongmovmt is "+dongmovmt );
}
String dongetc = req.getParameter("dongetc");
if( dongetc == null){
    System.out.println(this.toString+" : dongetc is null" );
}else{
    System.out.println(this.toString+" : dongetc is "+dongetc );
}
String etcpoly = req.getParameter("etcpoly");
if( etcpoly == null){
    System.out.println(this.toString+" : etcpoly is null" );
}else{
    System.out.println(this.toString+" : etcpoly is "+etcpoly );
}
String etcmovmt = req.getParameter("etcmovmt");
if( etcmovmt == null){
    System.out.println(this.toString+" : etcmovmt is null" );
}else{
    System.out.println(this.toString+" : etcmovmt is "+etcmovmt );
}
String etcetc = req.getParameter("etcetc");
if( etcetc == null){
    System.out.println(this.toString+" : etcetc is null" );
}else{
    System.out.println(this.toString+" : etcetc is "+etcetc );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
    System.out.println(this.toString+" : filenm is null" );
}else{
    System.out.println(this.toString+" : filenm is "+filenm );
}
String filesize = req.getParameter("filesize");
if( filesize == null){
    System.out.println(this.toString+" : filesize is null" );
}else{
    System.out.println(this.toString+" : filesize is "+filesize );
}
String filecont = req.getParameter("filecont");
if( filecont == null){
    System.out.println(this.toString+" : filecont is null" );
}else{
    System.out.println(this.toString+" : filecont is "+filecont );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
    System.out.println(this.toString+" : incmgpers is null" );
}else{
    System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String incmgdt = req.getParameter("incmgdt");
if( incmgdt == null){
    System.out.println(this.toString+" : incmgdt is null" );
}else{
    System.out.println(this.toString+" : incmgdt is "+incmgdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String makepersnm = Util.checkString(req.getParameter("makepersnm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String deptnm = Util.checkString(req.getParameter("deptnm"));
String jungpoly = Util.checkString(req.getParameter("jungpoly"));
String jungmovmt = Util.checkString(req.getParameter("jungmovmt"));
String jungetc = Util.checkString(req.getParameter("jungetc"));
String dongpoly = Util.checkString(req.getParameter("dongpoly"));
String dongmovmt = Util.checkString(req.getParameter("dongmovmt"));
String dongetc = Util.checkString(req.getParameter("dongetc"));
String etcpoly = Util.checkString(req.getParameter("etcpoly"));
String etcmovmt = Util.checkString(req.getParameter("etcmovmt"));
String etcetc = Util.checkString(req.getParameter("etcetc"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filesize = Util.checkString(req.getParameter("filesize"));
String filecont = Util.checkString(req.getParameter("filecont"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmgdt = Util.checkString(req.getParameter("incmgdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String deptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deptnm")));
String jungpoly = Util.Uni2Ksc(Util.checkString(req.getParameter("jungpoly")));
String jungmovmt = Util.Uni2Ksc(Util.checkString(req.getParameter("jungmovmt")));
String jungetc = Util.Uni2Ksc(Util.checkString(req.getParameter("jungetc")));
String dongpoly = Util.Uni2Ksc(Util.checkString(req.getParameter("dongpoly")));
String dongmovmt = Util.Uni2Ksc(Util.checkString(req.getParameter("dongmovmt")));
String dongetc = Util.Uni2Ksc(Util.checkString(req.getParameter("dongetc")));
String etcpoly = Util.Uni2Ksc(Util.checkString(req.getParameter("etcpoly")));
String etcmovmt = Util.Uni2Ksc(Util.checkString(req.getParameter("etcmovmt")));
String etcetc = Util.Uni2Ksc(Util.checkString(req.getParameter("etcetc")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filesize = Util.Uni2Ksc(Util.checkString(req.getParameter("filesize")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
dm.setMakepersnm(makepersnm);
dm.setDeptcd(deptcd);
dm.setDeptnm(deptnm);
dm.setJungpoly(jungpoly);
dm.setJungmovmt(jungmovmt);
dm.setJungetc(jungetc);
dm.setDongpoly(dongpoly);
dm.setDongmovmt(dongmovmt);
dm.setDongetc(dongetc);
dm.setEtcpoly(etcpoly);
dm.setEtcmovmt(etcmovmt);
dm.setEtcetc(etcetc);
dm.setFilenm(filenm);
dm.setFilesize(filesize);
dm.setFilecont(filecont);
dm.setIncmgpers(incmgpers);
dm.setIncmgdt(incmgdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 11 17:51:37 KST 2004 */
