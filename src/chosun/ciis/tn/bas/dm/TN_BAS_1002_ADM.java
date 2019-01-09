/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String organidx;
	public String organname;
	public String businessno;
	public String address;
	public String law;
	public String recipientname;
	public String stampimagepath;
	public String phot;

	public TN_BAS_1002_ADM(){}
	public TN_BAS_1002_ADM(String cmpy_cd, String organidx, String organname, String businessno, String address, String law, String recipientname, String stampimagepath, String phot){
		this.cmpy_cd = cmpy_cd;
		this.organidx = organidx;
		this.organname = organname;
		this.businessno = businessno;
		this.address = address;
		this.law = law;
		this.recipientname = recipientname;
		this.stampimagepath = stampimagepath;
		this.phot = phot;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setOrganname(String organname){
		this.organname = organname;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setLaw(String law){
		this.law = law;
	}

	public void setRecipientname(String recipientname){
		this.recipientname = recipientname;
	}

	public void setStampimagepath(String stampimagepath){
		this.stampimagepath = stampimagepath;
	}

	public void setPhot(String phot){
		this.phot = phot;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getOrganname(){
		return this.organname;
	}

	public String getBusinessno(){
		return this.businessno;
	}

	public String getAddress(){
		return this.address;
	}

	public String getLaw(){
		return this.law;
	}

	public String getRecipientname(){
		return this.recipientname;
	}

	public String getStampimagepath(){
		return this.stampimagepath;
	}

	public String getPhot(){
		return this.phot;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_1002_ADM dm = (TN_BAS_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.organidx);
		cstmt.setString(5, dm.organname);
		cstmt.setString(6, dm.businessno);
		cstmt.setString(7, dm.address);
		cstmt.setString(8, dm.law);
		cstmt.setString(9, dm.recipientname);
		cstmt.setString(10, dm.stampimagepath);
		cstmt.setString(11, dm.phot);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_1002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("organidx = [" + getOrganidx() + "]");
		System.out.println("organname = [" + getOrganname() + "]");
		System.out.println("businessno = [" + getBusinessno() + "]");
		System.out.println("address = [" + getAddress() + "]");
		System.out.println("law = [" + getLaw() + "]");
		System.out.println("recipientname = [" + getRecipientname() + "]");
		System.out.println("stampimagepath = [" + getStampimagepath() + "]");
		System.out.println("phot = [" + getPhot() + "]");
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
String organidx = req.getParameter("organidx");
if( organidx == null){
	System.out.println(this.toString+" : organidx is null" );
}else{
	System.out.println(this.toString+" : organidx is "+organidx );
}
String organname = req.getParameter("organname");
if( organname == null){
	System.out.println(this.toString+" : organname is null" );
}else{
	System.out.println(this.toString+" : organname is "+organname );
}
String businessno = req.getParameter("businessno");
if( businessno == null){
	System.out.println(this.toString+" : businessno is null" );
}else{
	System.out.println(this.toString+" : businessno is "+businessno );
}
String address = req.getParameter("address");
if( address == null){
	System.out.println(this.toString+" : address is null" );
}else{
	System.out.println(this.toString+" : address is "+address );
}
String law = req.getParameter("law");
if( law == null){
	System.out.println(this.toString+" : law is null" );
}else{
	System.out.println(this.toString+" : law is "+law );
}
String recipientname = req.getParameter("recipientname");
if( recipientname == null){
	System.out.println(this.toString+" : recipientname is null" );
}else{
	System.out.println(this.toString+" : recipientname is "+recipientname );
}
String stampimagepath = req.getParameter("stampimagepath");
if( stampimagepath == null){
	System.out.println(this.toString+" : stampimagepath is null" );
}else{
	System.out.println(this.toString+" : stampimagepath is "+stampimagepath );
}
String phot = req.getParameter("phot");
if( phot == null){
	System.out.println(this.toString+" : phot is null" );
}else{
	System.out.println(this.toString+" : phot is "+phot );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String organidx = Util.checkString(req.getParameter("organidx"));
String organname = Util.checkString(req.getParameter("organname"));
String businessno = Util.checkString(req.getParameter("businessno"));
String address = Util.checkString(req.getParameter("address"));
String law = Util.checkString(req.getParameter("law"));
String recipientname = Util.checkString(req.getParameter("recipientname"));
String stampimagepath = Util.checkString(req.getParameter("stampimagepath"));
String phot = Util.checkString(req.getParameter("phot"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String organidx = Util.Uni2Ksc(Util.checkString(req.getParameter("organidx")));
String organname = Util.Uni2Ksc(Util.checkString(req.getParameter("organname")));
String businessno = Util.Uni2Ksc(Util.checkString(req.getParameter("businessno")));
String address = Util.Uni2Ksc(Util.checkString(req.getParameter("address")));
String law = Util.Uni2Ksc(Util.checkString(req.getParameter("law")));
String recipientname = Util.Uni2Ksc(Util.checkString(req.getParameter("recipientname")));
String stampimagepath = Util.Uni2Ksc(Util.checkString(req.getParameter("stampimagepath")));
String phot = Util.Uni2Ksc(Util.checkString(req.getParameter("phot")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOrganidx(organidx);
dm.setOrganname(organname);
dm.setBusinessno(businessno);
dm.setAddress(address);
dm.setLaw(law);
dm.setRecipientname(recipientname);
dm.setStampimagepath(stampimagepath);
dm.setPhot(phot);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 25 19:47:13 KST 2016 */