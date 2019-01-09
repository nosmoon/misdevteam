/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.ds.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String send_atic_no;
	public String send_atic_nm;
	public String reg_dd;
	public String car_kind;
	public String yy_styl;
	public String car_no;
	public String prn;
	public String tel;
	public String ceph;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String wh_cd;
	public String driv_yn;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_SND_1020_ADM(){}
	public IS_SND_1020_ADM(String cmpy_cd, String mode, String send_atic_no, String send_atic_nm, String reg_dd, String car_kind, String yy_styl, String car_no, String prn, String tel, String ceph, String zip_1, String zip_2, String addr, String dtls_addr, String wh_cd, String driv_yn, String remk, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.send_atic_no = send_atic_no;
		this.send_atic_nm = send_atic_nm;
		this.reg_dd = reg_dd;
		this.car_kind = car_kind;
		this.yy_styl = yy_styl;
		this.car_no = car_no;
		this.prn = prn;
		this.tel = tel;
		this.ceph = ceph;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.wh_cd = wh_cd;
		this.driv_yn = driv_yn;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSend_atic_no(String send_atic_no){
		this.send_atic_no = send_atic_no;
	}

	public void setSend_atic_nm(String send_atic_nm){
		this.send_atic_nm = send_atic_nm;
	}

	public void setReg_dd(String reg_dd){
		this.reg_dd = reg_dd;
	}

	public void setCar_kind(String car_kind){
		this.car_kind = car_kind;
	}

	public void setYy_styl(String yy_styl){
		this.yy_styl = yy_styl;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setCeph(String ceph){
		this.ceph = ceph;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setDriv_yn(String driv_yn){
		this.driv_yn = driv_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSend_atic_no(){
		return this.send_atic_no;
	}

	public String getSend_atic_nm(){
		return this.send_atic_nm;
	}

	public String getReg_dd(){
		return this.reg_dd;
	}

	public String getCar_kind(){
		return this.car_kind;
	}

	public String getYy_styl(){
		return this.yy_styl;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel(){
		return this.tel;
	}

	public String getCeph(){
		return this.ceph;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getDriv_yn(){
		return this.driv_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SND_1020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SND_1020_ADM dm = (IS_SND_1020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.send_atic_no);
		cstmt.setString(6, dm.send_atic_nm);
		cstmt.setString(7, dm.reg_dd);
		cstmt.setString(8, dm.car_kind);
		cstmt.setString(9, dm.yy_styl);
		cstmt.setString(10, dm.car_no);
		cstmt.setString(11, dm.prn);
		cstmt.setString(12, dm.tel);
		cstmt.setString(13, dm.ceph);
		cstmt.setString(14, dm.zip_1);
		cstmt.setString(15, dm.zip_2);
		cstmt.setString(16, dm.addr);
		cstmt.setString(17, dm.dtls_addr);
		cstmt.setString(18, dm.wh_cd);
		cstmt.setString(19, dm.driv_yn);
		cstmt.setString(20, dm.remk);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.snd.ds.IS_SND_1020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("send_atic_no = [" + getSend_atic_no() + "]");
		System.out.println("send_atic_nm = [" + getSend_atic_nm() + "]");
		System.out.println("reg_dd = [" + getReg_dd() + "]");
		System.out.println("car_kind = [" + getCar_kind() + "]");
		System.out.println("yy_styl = [" + getYy_styl() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("tel = [" + getTel() + "]");
		System.out.println("ceph = [" + getCeph() + "]");
		System.out.println("zip_1 = [" + getZip_1() + "]");
		System.out.println("zip_2 = [" + getZip_2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
		System.out.println("driv_yn = [" + getDriv_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String send_atic_no = req.getParameter("send_atic_no");
if( send_atic_no == null){
	System.out.println(this.toString+" : send_atic_no is null" );
}else{
	System.out.println(this.toString+" : send_atic_no is "+send_atic_no );
}
String send_atic_nm = req.getParameter("send_atic_nm");
if( send_atic_nm == null){
	System.out.println(this.toString+" : send_atic_nm is null" );
}else{
	System.out.println(this.toString+" : send_atic_nm is "+send_atic_nm );
}
String reg_dd = req.getParameter("reg_dd");
if( reg_dd == null){
	System.out.println(this.toString+" : reg_dd is null" );
}else{
	System.out.println(this.toString+" : reg_dd is "+reg_dd );
}
String car_kind = req.getParameter("car_kind");
if( car_kind == null){
	System.out.println(this.toString+" : car_kind is null" );
}else{
	System.out.println(this.toString+" : car_kind is "+car_kind );
}
String yy_styl = req.getParameter("yy_styl");
if( yy_styl == null){
	System.out.println(this.toString+" : yy_styl is null" );
}else{
	System.out.println(this.toString+" : yy_styl is "+yy_styl );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String tel = req.getParameter("tel");
if( tel == null){
	System.out.println(this.toString+" : tel is null" );
}else{
	System.out.println(this.toString+" : tel is "+tel );
}
String ceph = req.getParameter("ceph");
if( ceph == null){
	System.out.println(this.toString+" : ceph is null" );
}else{
	System.out.println(this.toString+" : ceph is "+ceph );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String wh_cd = req.getParameter("wh_cd");
if( wh_cd == null){
	System.out.println(this.toString+" : wh_cd is null" );
}else{
	System.out.println(this.toString+" : wh_cd is "+wh_cd );
}
String driv_yn = req.getParameter("driv_yn");
if( driv_yn == null){
	System.out.println(this.toString+" : driv_yn is null" );
}else{
	System.out.println(this.toString+" : driv_yn is "+driv_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
String send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
String reg_dd = Util.checkString(req.getParameter("reg_dd"));
String car_kind = Util.checkString(req.getParameter("car_kind"));
String yy_styl = Util.checkString(req.getParameter("yy_styl"));
String car_no = Util.checkString(req.getParameter("car_no"));
String prn = Util.checkString(req.getParameter("prn"));
String tel = Util.checkString(req.getParameter("tel"));
String ceph = Util.checkString(req.getParameter("ceph"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String wh_cd = Util.checkString(req.getParameter("wh_cd"));
String driv_yn = Util.checkString(req.getParameter("driv_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String send_atic_no = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_no")));
String send_atic_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_nm")));
String reg_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dd")));
String car_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("car_kind")));
String yy_styl = Util.Uni2Ksc(Util.checkString(req.getParameter("yy_styl")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String tel = Util.Uni2Ksc(Util.checkString(req.getParameter("tel")));
String ceph = Util.Uni2Ksc(Util.checkString(req.getParameter("ceph")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
String driv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSend_atic_no(send_atic_no);
dm.setSend_atic_nm(send_atic_nm);
dm.setReg_dd(reg_dd);
dm.setCar_kind(car_kind);
dm.setYy_styl(yy_styl);
dm.setCar_no(car_no);
dm.setPrn(prn);
dm.setTel(tel);
dm.setCeph(ceph);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setWh_cd(wh_cd);
dm.setDriv_yn(driv_yn);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 24 17:32:07 KST 2012 */