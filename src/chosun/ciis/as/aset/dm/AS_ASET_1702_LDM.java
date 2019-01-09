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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1702_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_dt_fr;
	public String rcpm_dt_to;
	public String dlco_ern;
	public String remk;

	public AS_ASET_1702_LDM(){}
	public AS_ASET_1702_LDM(String cmpy_cd, String rcpm_dt_fr, String rcpm_dt_to, String dlco_ern, String remk){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_dt_fr = rcpm_dt_fr;
		this.rcpm_dt_to = rcpm_dt_to;
		this.dlco_ern = dlco_ern;
		this.remk = remk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_dt_fr(String rcpm_dt_fr){
		this.rcpm_dt_fr = rcpm_dt_fr;
	}

	public void setRcpm_dt_to(String rcpm_dt_to){
		this.rcpm_dt_to = rcpm_dt_to;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_dt_fr(){
		return this.rcpm_dt_fr;
	}

	public String getRcpm_dt_to(){
		return this.rcpm_dt_to;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1702_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1702_LDM dm = (AS_ASET_1702_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_dt_fr);
		cstmt.setString(5, dm.rcpm_dt_to);
		cstmt.setString(6, dm.dlco_ern);
		cstmt.setString(7, dm.remk);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1702_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("rcpm_dt_fr = " + getRcpm_dt_fr());
        System.out.println("rcpm_dt_to = " + getRcpm_dt_to());
        System.out.println("dlco_ern = " + getDlco_ern());
        System.out.println("remk = " + getRemk());
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
String rcpm_dt_fr = req.getParameter("rcpm_dt_fr");
if( rcpm_dt_fr == null){
	System.out.println(this.toString+" : rcpm_dt_fr is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt_fr is "+rcpm_dt_fr );
}
String rcpm_dt_to = req.getParameter("rcpm_dt_to");
if( rcpm_dt_to == null){
	System.out.println(this.toString+" : rcpm_dt_to is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt_to is "+rcpm_dt_to );
}
String dlco_ern = req.getParameter("dlco_ern");
if( dlco_ern == null){
	System.out.println(this.toString+" : dlco_ern is null" );
}else{
	System.out.println(this.toString+" : dlco_ern is "+dlco_ern );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_dt_fr = Util.checkString(req.getParameter("rcpm_dt_fr"));
String rcpm_dt_to = Util.checkString(req.getParameter("rcpm_dt_to"));
String dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt_fr")));
String rcpm_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt_to")));
String dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_ern")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_dt_fr(rcpm_dt_fr);
dm.setRcpm_dt_to(rcpm_dt_to);
dm.setDlco_ern(dlco_ern);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 20:33:44 KST 2009 */