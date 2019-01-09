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


package chosun.ciis.ad.com.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_COM_1530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String yyyy;
	public String seq;
	public String rcv_plac;
	public String zip1;
	public String zip2;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String fax_no;
	public String send_plac;
	public String titl;
	public String cont;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_COM_1530_ADM(){}
	public AD_COM_1530_ADM(String flag, String cmpy_cd, String yyyy, String seq, String rcv_plac, String zip1, String zip2, String addr, String dtls_addr, String tel_no, String fax_no, String send_plac, String titl, String cont, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.yyyy = yyyy;
		this.seq = seq;
		this.rcv_plac = rcv_plac;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.send_plac = send_plac;
		this.titl = titl;
		this.cont = cont;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcv_plac(String rcv_plac){
		this.rcv_plac = rcv_plac;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setSend_plac(String send_plac){
		this.send_plac = send_plac;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcv_plac(){
		return this.rcv_plac;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getSend_plac(){
		return this.send_plac;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_COM_1530_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_COM_1530_ADM dm = (AD_COM_1530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yyyy);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.rcv_plac);
		cstmt.setString(8, dm.zip1);
		cstmt.setString(9, dm.zip2);
		cstmt.setString(10, dm.addr);
		cstmt.setString(11, dm.dtls_addr);
		cstmt.setString(12, dm.tel_no);
		cstmt.setString(13, dm.fax_no);
		cstmt.setString(14, dm.send_plac);
		cstmt.setString(15, dm.titl);
		cstmt.setString(16, dm.cont);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.com.ds.AD_COM_1530_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyy = [" + getYyyy() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("rcv_plac = [" + getRcv_plac() + "]");
		System.out.println("zip1 = [" + getZip1() + "]");
		System.out.println("zip2 = [" + getZip2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("fax_no = [" + getFax_no() + "]");
		System.out.println("send_plac = [" + getSend_plac() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("cont = [" + getCont() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rcv_plac = req.getParameter("rcv_plac");
if( rcv_plac == null){
	System.out.println(this.toString+" : rcv_plac is null" );
}else{
	System.out.println(this.toString+" : rcv_plac is "+rcv_plac );
}
String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
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
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String send_plac = req.getParameter("send_plac");
if( send_plac == null){
	System.out.println(this.toString+" : send_plac is null" );
}else{
	System.out.println(this.toString+" : send_plac is "+send_plac );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String seq = Util.checkString(req.getParameter("seq"));
String rcv_plac = Util.checkString(req.getParameter("rcv_plac"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String send_plac = Util.checkString(req.getParameter("send_plac"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rcv_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rcv_plac")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String send_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setSeq(seq);
dm.setRcv_plac(rcv_plac);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setTel_no(tel_no);
dm.setFax_no(fax_no);
dm.setSend_plac(send_plac);
dm.setTitl(titl);
dm.setCont(cont);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:10:02 KST 2009 */