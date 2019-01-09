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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3121_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt;
	public String chcode;
	public String cuscode;
	public String blndcode;
	public String orgcode;
	public String frdate;
	public String todate;
	public String rcvgrp;
	public String chgcode;
	public String dtlseq;
	public String dtls_medi_cd;

	public AD_PUB_3121_SDM(){}
	public AD_PUB_3121_SDM(String cmpy_cd, String clos_dt, String chcode, String cuscode, String blndcode, String orgcode, String frdate, String todate, String rcvgrp, String chgcode, String dtlseq, String dtls_medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt = clos_dt;
		this.chcode = chcode;
		this.cuscode = cuscode;
		this.blndcode = blndcode;
		this.orgcode = orgcode;
		this.frdate = frdate;
		this.todate = todate;
		this.rcvgrp = rcvgrp;
		this.chgcode = chgcode;
		this.dtlseq = dtlseq;
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setBlndcode(String blndcode){
		this.blndcode = blndcode;
	}

	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}

	public void setFrdate(String frdate){
		this.frdate = frdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
	}

	public void setRcvgrp(String rcvgrp){
		this.rcvgrp = rcvgrp;
	}

	public void setChgcode(String chgcode){
		this.chgcode = chgcode;
	}

	public void setDtlseq(String dtlseq){
		this.dtlseq = dtlseq;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getBlndcode(){
		return this.blndcode;
	}

	public String getOrgcode(){
		return this.orgcode;
	}

	public String getFrdate(){
		return this.frdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getRcvgrp(){
		return this.rcvgrp;
	}

	public String getChgcode(){
		return this.chgcode;
	}

	public String getDtlseq(){
		return this.dtlseq;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3121_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3121_SDM dm = (AD_PUB_3121_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt);
		cstmt.setString(5, dm.chcode);
		cstmt.setString(6, dm.cuscode);
		cstmt.setString(7, dm.blndcode);
		cstmt.setString(8, dm.orgcode);
		cstmt.setString(9, dm.frdate);
		cstmt.setString(10, dm.todate);
		cstmt.setString(11, dm.rcvgrp);
		cstmt.setString(12, dm.chgcode);
		cstmt.setString(13, dm.dtlseq);
		cstmt.setString(14, dm.dtls_medi_cd);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3121_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
		System.out.println("cuscode = [" + getCuscode() + "]");
		System.out.println("blndcode = [" + getBlndcode() + "]");
		System.out.println("orgcode = [" + getOrgcode() + "]");
		System.out.println("frdate = [" + getFrdate() + "]");
		System.out.println("todate = [" + getTodate() + "]");
		System.out.println("rcvgrp = [" + getRcvgrp() + "]");
		System.out.println("chgcode = [" + getChgcode() + "]");
		System.out.println("dtlseq = [" + getDtlseq() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
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
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
String cuscode = req.getParameter("cuscode");
if( cuscode == null){
	System.out.println(this.toString+" : cuscode is null" );
}else{
	System.out.println(this.toString+" : cuscode is "+cuscode );
}
String blndcode = req.getParameter("blndcode");
if( blndcode == null){
	System.out.println(this.toString+" : blndcode is null" );
}else{
	System.out.println(this.toString+" : blndcode is "+blndcode );
}
String orgcode = req.getParameter("orgcode");
if( orgcode == null){
	System.out.println(this.toString+" : orgcode is null" );
}else{
	System.out.println(this.toString+" : orgcode is "+orgcode );
}
String frdate = req.getParameter("frdate");
if( frdate == null){
	System.out.println(this.toString+" : frdate is null" );
}else{
	System.out.println(this.toString+" : frdate is "+frdate );
}
String todate = req.getParameter("todate");
if( todate == null){
	System.out.println(this.toString+" : todate is null" );
}else{
	System.out.println(this.toString+" : todate is "+todate );
}
String rcvgrp = req.getParameter("rcvgrp");
if( rcvgrp == null){
	System.out.println(this.toString+" : rcvgrp is null" );
}else{
	System.out.println(this.toString+" : rcvgrp is "+rcvgrp );
}
String chgcode = req.getParameter("chgcode");
if( chgcode == null){
	System.out.println(this.toString+" : chgcode is null" );
}else{
	System.out.println(this.toString+" : chgcode is "+chgcode );
}
String dtlseq = req.getParameter("dtlseq");
if( dtlseq == null){
	System.out.println(this.toString+" : dtlseq is null" );
}else{
	System.out.println(this.toString+" : dtlseq is "+dtlseq );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String chcode = Util.checkString(req.getParameter("chcode"));
String cuscode = Util.checkString(req.getParameter("cuscode"));
String blndcode = Util.checkString(req.getParameter("blndcode"));
String orgcode = Util.checkString(req.getParameter("orgcode"));
String frdate = Util.checkString(req.getParameter("frdate"));
String todate = Util.checkString(req.getParameter("todate"));
String rcvgrp = Util.checkString(req.getParameter("rcvgrp"));
String chgcode = Util.checkString(req.getParameter("chgcode"));
String dtlseq = Util.checkString(req.getParameter("dtlseq"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
String cuscode = Util.Uni2Ksc(Util.checkString(req.getParameter("cuscode")));
String blndcode = Util.Uni2Ksc(Util.checkString(req.getParameter("blndcode")));
String orgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("orgcode")));
String frdate = Util.Uni2Ksc(Util.checkString(req.getParameter("frdate")));
String todate = Util.Uni2Ksc(Util.checkString(req.getParameter("todate")));
String rcvgrp = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvgrp")));
String chgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chgcode")));
String dtlseq = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlseq")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt(clos_dt);
dm.setChcode(chcode);
dm.setCuscode(cuscode);
dm.setBlndcode(blndcode);
dm.setOrgcode(orgcode);
dm.setFrdate(frdate);
dm.setTodate(todate);
dm.setRcvgrp(rcvgrp);
dm.setChgcode(chgcode);
dm.setDtlseq(dtlseq);
dm.setDtls_medi_cd(dtls_medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 10 19:57:15 KST 2014 */