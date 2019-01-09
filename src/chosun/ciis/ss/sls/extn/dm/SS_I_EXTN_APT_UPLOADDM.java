/***************************************************************************************************
* 파일명 : .java
* 기능 : 입주아파트관리 엑셀 업로드
* 작성일자 : 2009-05-18
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 입주아파트관리 엑셀 업로드
 */

public class SS_I_EXTN_APT_UPLOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String aptnm;
	public String deptcd;
	public String addr1;
	public String addr2;
	public String addr3;
	public String tothoscnt;
	public String pyong;
	public String pyongothin;
	public String hoscnt;
	public String saledd;
	public String mvinplandd;
	public String constcmpynm;
	public String apttype;

	public SS_I_EXTN_APT_UPLOADDM(){}
	public SS_I_EXTN_APT_UPLOADDM(String uid, String aptnm, String deptcd, String addr1, String addr2, String addr3, String tothoscnt, String pyong, String pyongothin, String hoscnt, String saledd, String mvinplandd, String constcmpynm, String apttype){
		this.uid = uid;
		this.aptnm = aptnm;
		this.deptcd = deptcd;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		this.tothoscnt = tothoscnt;
		this.pyong = pyong;
		this.pyongothin = pyongothin;
		this.hoscnt = hoscnt;
		this.saledd = saledd;
		this.mvinplandd = mvinplandd;
		this.constcmpynm = constcmpynm;
		this.apttype = apttype;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setAptnm(String aptnm){
		this.aptnm = aptnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAddr1(String addr1){
		this.addr1 = addr1;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setTothoscnt(String tothoscnt){
		this.tothoscnt = tothoscnt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setPyongothin(String pyongothin){
		this.pyongothin = pyongothin;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setSaledd(String saledd){
		this.saledd = saledd;
	}

	public void setMvinplandd(String mvinplandd){
		this.mvinplandd = mvinplandd;
	}

	public void setConstcmpynm(String constcmpynm){
		this.constcmpynm = constcmpynm;
	}

	public void setApttype(String apttype){
		this.apttype = apttype;
	}

	public String getUid(){
		return this.uid;
	}

	public String getAptnm(){
		return this.aptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAddr1(){
		return this.addr1;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public String getTothoscnt(){
		return this.tothoscnt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getPyongothin(){
		return this.pyongothin;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getSaledd(){
		return this.saledd;
	}

	public String getMvinplandd(){
		return this.mvinplandd;
	}

	public String getConstcmpynm(){
		return this.constcmpynm;
	}

	public String getApttype(){
		return this.apttype;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_EXTN_APT_UPLOAD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_APT_UPLOADDM dm = (SS_I_EXTN_APT_UPLOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.aptnm);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.addr1);
		cstmt.setString(7, dm.addr2);
		cstmt.setString(8, dm.addr3);
		cstmt.setString(9, dm.tothoscnt);
		cstmt.setString(10, dm.pyong);
		cstmt.setString(11, dm.pyongothin);
		cstmt.setString(12, dm.hoscnt);
		cstmt.setString(13, dm.saledd);
		cstmt.setString(14, dm.mvinplandd);
		cstmt.setString(15, dm.constcmpynm);
		cstmt.setString(16, dm.apttype);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_APT_UPLOADDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String aptnm = req.getParameter("aptnm");
if( aptnm == null){
	System.out.println(this.toString+" : aptnm is null" );
}else{
	System.out.println(this.toString+" : aptnm is "+aptnm );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String addr1 = req.getParameter("addr1");
if( addr1 == null){
	System.out.println(this.toString+" : addr1 is null" );
}else{
	System.out.println(this.toString+" : addr1 is "+addr1 );
}
String addr2 = req.getParameter("addr2");
if( addr2 == null){
	System.out.println(this.toString+" : addr2 is null" );
}else{
	System.out.println(this.toString+" : addr2 is "+addr2 );
}
String addr3 = req.getParameter("addr3");
if( addr3 == null){
	System.out.println(this.toString+" : addr3 is null" );
}else{
	System.out.println(this.toString+" : addr3 is "+addr3 );
}
String tothoscnt = req.getParameter("tothoscnt");
if( tothoscnt == null){
	System.out.println(this.toString+" : tothoscnt is null" );
}else{
	System.out.println(this.toString+" : tothoscnt is "+tothoscnt );
}
String pyong = req.getParameter("pyong");
if( pyong == null){
	System.out.println(this.toString+" : pyong is null" );
}else{
	System.out.println(this.toString+" : pyong is "+pyong );
}
String pyongothin = req.getParameter("pyongothin");
if( pyongothin == null){
	System.out.println(this.toString+" : pyongothin is null" );
}else{
	System.out.println(this.toString+" : pyongothin is "+pyongothin );
}
String hoscnt = req.getParameter("hoscnt");
if( hoscnt == null){
	System.out.println(this.toString+" : hoscnt is null" );
}else{
	System.out.println(this.toString+" : hoscnt is "+hoscnt );
}
String saledd = req.getParameter("saledd");
if( saledd == null){
	System.out.println(this.toString+" : saledd is null" );
}else{
	System.out.println(this.toString+" : saledd is "+saledd );
}
String mvinplandd = req.getParameter("mvinplandd");
if( mvinplandd == null){
	System.out.println(this.toString+" : mvinplandd is null" );
}else{
	System.out.println(this.toString+" : mvinplandd is "+mvinplandd );
}
String constcmpynm = req.getParameter("constcmpynm");
if( constcmpynm == null){
	System.out.println(this.toString+" : constcmpynm is null" );
}else{
	System.out.println(this.toString+" : constcmpynm is "+constcmpynm );
}
String apttype = req.getParameter("apttype");
if( apttype == null){
	System.out.println(this.toString+" : apttype is null" );
}else{
	System.out.println(this.toString+" : apttype is "+apttype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String aptnm = Util.checkString(req.getParameter("aptnm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String addr1 = Util.checkString(req.getParameter("addr1"));
String addr2 = Util.checkString(req.getParameter("addr2"));
String addr3 = Util.checkString(req.getParameter("addr3"));
String tothoscnt = Util.checkString(req.getParameter("tothoscnt"));
String pyong = Util.checkString(req.getParameter("pyong"));
String pyongothin = Util.checkString(req.getParameter("pyongothin"));
String hoscnt = Util.checkString(req.getParameter("hoscnt"));
String saledd = Util.checkString(req.getParameter("saledd"));
String mvinplandd = Util.checkString(req.getParameter("mvinplandd"));
String constcmpynm = Util.checkString(req.getParameter("constcmpynm"));
String apttype = Util.checkString(req.getParameter("apttype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String aptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aptnm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String addr1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1")));
String addr2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2")));
String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
String tothoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tothoscnt")));
String pyong = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong")));
String pyongothin = Util.Uni2Ksc(Util.checkString(req.getParameter("pyongothin")));
String hoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt")));
String saledd = Util.Uni2Ksc(Util.checkString(req.getParameter("saledd")));
String mvinplandd = Util.Uni2Ksc(Util.checkString(req.getParameter("mvinplandd")));
String constcmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("constcmpynm")));
String apttype = Util.Uni2Ksc(Util.checkString(req.getParameter("apttype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setAptnm(aptnm);
dm.setDeptcd(deptcd);
dm.setAddr1(addr1);
dm.setAddr2(addr2);
dm.setAddr3(addr3);
dm.setTothoscnt(tothoscnt);
dm.setPyong(pyong);
dm.setPyongothin(pyongothin);
dm.setHoscnt(hoscnt);
dm.setSaledd(saledd);
dm.setMvinplandd(mvinplandd);
dm.setConstcmpynm(constcmpynm);
dm.setApttype(apttype);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 16:45:11 KST 2009 */