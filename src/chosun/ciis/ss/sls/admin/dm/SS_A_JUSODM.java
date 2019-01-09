/***************************************************************************************************
* 파일명 : SS_A_JUSODM.java
* 기능 : 관리자-우편번호-저장(판매국 우편번호)을 위한 DM
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-우편번호-저장(판매국 우편번호)을 위한 DM
 */

public class SS_A_JUSODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String zip1;
	public String zip2;
	public String zip3;
	public String addr1ary;
	public String addr2ary;
	public String addr3ary;
	public String largedlvplacary;
	public String isldary;
	public String bgnnary;
	public String endnary;
	public String bocdary;

	public SS_A_JUSODM(){}
	public SS_A_JUSODM(String incmgpers, String zip1, String zip2, String zip3, String addr1ary, String addr2ary, String addr3ary, String largedlvplacary, String isldary, String bgnnary, String endnary, String bocdary){
		this.incmgpers = incmgpers;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.zip3 = zip3;
		this.addr1ary = addr1ary;
		this.addr2ary = addr2ary;
		this.addr3ary = addr3ary;
		this.largedlvplacary = largedlvplacary;
		this.isldary = isldary;
		this.bgnnary = bgnnary;
		this.endnary = endnary;
		this.bocdary = bocdary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public void setAddr1ary(String addr1ary){
		this.addr1ary = addr1ary;
	}

	public void setAddr2ary(String addr2ary){
		this.addr2ary = addr2ary;
	}

	public void setAddr3ary(String addr3ary){
		this.addr3ary = addr3ary;
	}

	public void setLargedlvplacary(String largedlvplacary){
		this.largedlvplacary = largedlvplacary;
	}

	public void setIsldary(String isldary){
		this.isldary = isldary;
	}

	public void setBgnnary(String bgnnary){
		this.bgnnary = bgnnary;
	}

	public void setEndnary(String endnary){
		this.endnary = endnary;
	}

	public void setBocdary(String bocdary){
		this.bocdary = bocdary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getAddr1ary(){
		return this.addr1ary;
	}

	public String getAddr2ary(){
		return this.addr2ary;
	}

	public String getAddr3ary(){
		return this.addr3ary;
	}

	public String getLargedlvplacary(){
		return this.largedlvplacary;
	}

	public String getIsldary(){
		return this.isldary;
	}

	public String getBgnnary(){
		return this.bgnnary;
	}

	public String getEndnary(){
		return this.endnary;
	}

	public String getBocdary(){
		return this.bocdary;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_JUSO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_JUSODM dm = (SS_A_JUSODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.zip1);
		cstmt.setString(5, dm.zip2);
		cstmt.setString(6, dm.zip3);
		cstmt.setString(7, dm.addr1ary);
		cstmt.setString(8, dm.addr2ary);
		cstmt.setString(9, dm.addr3ary);
		cstmt.setString(10, dm.largedlvplacary);
		cstmt.setString(11, dm.isldary);
		cstmt.setString(12, dm.bgnnary);
		cstmt.setString(13, dm.endnary);
		cstmt.setString(14, dm.bocdary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_JUSODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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
String zip3 = req.getParameter("zip3");
if( zip3 == null){
	System.out.println(this.toString+" : zip3 is null" );
}else{
	System.out.println(this.toString+" : zip3 is "+zip3 );
}
String addr1ary = req.getParameter("addr1ary");
if( addr1ary == null){
	System.out.println(this.toString+" : addr1ary is null" );
}else{
	System.out.println(this.toString+" : addr1ary is "+addr1ary );
}
String addr2ary = req.getParameter("addr2ary");
if( addr2ary == null){
	System.out.println(this.toString+" : addr2ary is null" );
}else{
	System.out.println(this.toString+" : addr2ary is "+addr2ary );
}
String addr3ary = req.getParameter("addr3ary");
if( addr3ary == null){
	System.out.println(this.toString+" : addr3ary is null" );
}else{
	System.out.println(this.toString+" : addr3ary is "+addr3ary );
}
String largedlvplacary = req.getParameter("largedlvplacary");
if( largedlvplacary == null){
	System.out.println(this.toString+" : largedlvplacary is null" );
}else{
	System.out.println(this.toString+" : largedlvplacary is "+largedlvplacary );
}
String isldary = req.getParameter("isldary");
if( isldary == null){
	System.out.println(this.toString+" : isldary is null" );
}else{
	System.out.println(this.toString+" : isldary is "+isldary );
}
String bgnnary = req.getParameter("bgnnary");
if( bgnnary == null){
	System.out.println(this.toString+" : bgnnary is null" );
}else{
	System.out.println(this.toString+" : bgnnary is "+bgnnary );
}
String endnary = req.getParameter("endnary");
if( endnary == null){
	System.out.println(this.toString+" : endnary is null" );
}else{
	System.out.println(this.toString+" : endnary is "+endnary );
}
String bocdary = req.getParameter("bocdary");
if( bocdary == null){
	System.out.println(this.toString+" : bocdary is null" );
}else{
	System.out.println(this.toString+" : bocdary is "+bocdary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String zip3 = Util.checkString(req.getParameter("zip3"));
String addr1ary = Util.checkString(req.getParameter("addr1ary"));
String addr2ary = Util.checkString(req.getParameter("addr2ary"));
String addr3ary = Util.checkString(req.getParameter("addr3ary"));
String largedlvplacary = Util.checkString(req.getParameter("largedlvplacary"));
String isldary = Util.checkString(req.getParameter("isldary"));
String bgnnary = Util.checkString(req.getParameter("bgnnary"));
String endnary = Util.checkString(req.getParameter("endnary"));
String bocdary = Util.checkString(req.getParameter("bocdary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3")));
String addr1ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1ary")));
String addr2ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2ary")));
String addr3ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3ary")));
String largedlvplacary = Util.Uni2Ksc(Util.checkString(req.getParameter("largedlvplacary")));
String isldary = Util.Uni2Ksc(Util.checkString(req.getParameter("isldary")));
String bgnnary = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnnary")));
String endnary = Util.Uni2Ksc(Util.checkString(req.getParameter("endnary")));
String bocdary = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setZip3(zip3);
dm.setAddr1ary(addr1ary);
dm.setAddr2ary(addr2ary);
dm.setAddr3ary(addr3ary);
dm.setLargedlvplacary(largedlvplacary);
dm.setIsldary(isldary);
dm.setBgnnary(bgnnary);
dm.setEndnary(endnary);
dm.setBocdary(bocdary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 11 10:50:09 KST 2004 */