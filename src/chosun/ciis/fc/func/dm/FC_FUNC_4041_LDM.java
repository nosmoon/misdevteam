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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4041_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_cd;
	public String curacct_clsf_cd;
	public String pch_cymd1fr;
	public String pch_cymd1to;
	public String pch_cymd2fr;
	public String pch_cymd2to;

	public FC_FUNC_4041_LDM(){}
	public FC_FUNC_4041_LDM(String cmpy_cd, String stat_cd, String curacct_clsf_cd, String pch_cymd1fr, String pch_cymd1to, String pch_cymd2fr, String pch_cymd2to){
		this.cmpy_cd = cmpy_cd;
		this.stat_cd = stat_cd;
		this.curacct_clsf_cd = curacct_clsf_cd;
		this.pch_cymd1fr = pch_cymd1fr;
		this.pch_cymd1to = pch_cymd1to;
		this.pch_cymd2fr = pch_cymd2fr;
		this.pch_cymd2to = pch_cymd2to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setPch_cymd1fr(String pch_cymd1fr){
		this.pch_cymd1fr = pch_cymd1fr;
	}

	public void setPch_cymd1to(String pch_cymd1to){
		this.pch_cymd1to = pch_cymd1to;
	}

	public void setPch_cymd2fr(String pch_cymd2fr){
		this.pch_cymd2fr = pch_cymd2fr;
	}

	public void setPch_cymd2to(String pch_cymd2to){
		this.pch_cymd2to = pch_cymd2to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getPch_cymd1fr(){
		return this.pch_cymd1fr;
	}

	public String getPch_cymd1to(){
		return this.pch_cymd1to;
	}

	public String getPch_cymd2fr(){
		return this.pch_cymd2fr;
	}

	public String getPch_cymd2to(){
		return this.pch_cymd2to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4041_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4041_LDM dm = (FC_FUNC_4041_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_cd);
		cstmt.setString(5, dm.curacct_clsf_cd);
		cstmt.setString(6, dm.pch_cymd1fr);
		cstmt.setString(7, dm.pch_cymd1to);
		cstmt.setString(8, dm.pch_cymd2fr);
		cstmt.setString(9, dm.pch_cymd2to);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4041_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("stat_cd = " + getStat_cd());
        System.out.println("curacct_clsf_cd = " + getCuracct_clsf_cd());
        System.out.println("pch_cymd1fr = " + getPch_cymd1fr());
        System.out.println("pch_cymd1to = " + getPch_cymd1to());
        System.out.println("pch_cymd2fr = " + getPch_cymd2fr());
        System.out.println("pch_cymd2to = " + getPch_cymd2to());
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
String stat_cd = req.getParameter("stat_cd");
if( stat_cd == null){
	System.out.println(this.toString+" : stat_cd is null" );
}else{
	System.out.println(this.toString+" : stat_cd is "+stat_cd );
}
String curacct_clsf_cd = req.getParameter("curacct_clsf_cd");
if( curacct_clsf_cd == null){
	System.out.println(this.toString+" : curacct_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : curacct_clsf_cd is "+curacct_clsf_cd );
}
String pch_cymd1fr = req.getParameter("pch_cymd1fr");
if( pch_cymd1fr == null){
	System.out.println(this.toString+" : pch_cymd1fr is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1fr is "+pch_cymd1fr );
}
String pch_cymd1to = req.getParameter("pch_cymd1to");
if( pch_cymd1to == null){
	System.out.println(this.toString+" : pch_cymd1to is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1to is "+pch_cymd1to );
}
String pch_cymd2fr = req.getParameter("pch_cymd2fr");
if( pch_cymd2fr == null){
	System.out.println(this.toString+" : pch_cymd2fr is null" );
}else{
	System.out.println(this.toString+" : pch_cymd2fr is "+pch_cymd2fr );
}
String pch_cymd2to = req.getParameter("pch_cymd2to");
if( pch_cymd2to == null){
	System.out.println(this.toString+" : pch_cymd2to is null" );
}else{
	System.out.println(this.toString+" : pch_cymd2to is "+pch_cymd2to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_cd = Util.checkString(req.getParameter("stat_cd"));
String curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
String pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
String pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
String pch_cymd2fr = Util.checkString(req.getParameter("pch_cymd2fr"));
String pch_cymd2to = Util.checkString(req.getParameter("pch_cymd2to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd")));
String curacct_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("curacct_clsf_cd")));
String pch_cymd1fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1fr")));
String pch_cymd1to = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1to")));
String pch_cymd2fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd2fr")));
String pch_cymd2to = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd2to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_cd(stat_cd);
dm.setCuracct_clsf_cd(curacct_clsf_cd);
dm.setPch_cymd1fr(pch_cymd1fr);
dm.setPch_cymd1to(pch_cymd1to);
dm.setPch_cymd2fr(pch_cymd2fr);
dm.setPch_cymd2to(pch_cymd2to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 19:34:22 KST 2009 */