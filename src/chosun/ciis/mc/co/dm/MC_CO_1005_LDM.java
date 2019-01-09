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


package chosun.ciis.mc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.ds.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_1005_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cd;
	public String cdnm;
	public String from_cd;
	public String to_cd;
	public String bgn_dt;
	public String last_dt;

	public MC_CO_1005_LDM(){}
	public MC_CO_1005_LDM(String cmpy_cd, String cd, String cdnm, String from_cd, String to_cd, String bgn_dt, String last_dt){
		this.cmpy_cd = cmpy_cd;
		this.cd = cd;
		this.cdnm = cdnm;
		this.from_cd = from_cd;
		this.to_cd = to_cd;
		this.bgn_dt = bgn_dt;
		this.last_dt = last_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setFrom_cd(String from_cd){
		this.from_cd = from_cd;
	}

	public void setTo_cd(String to_cd){
		this.to_cd = to_cd;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setLast_dt(String last_dt){
		this.last_dt = last_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getFrom_cd(){
		return this.from_cd;
	}

	public String getTo_cd(){
		return this.to_cd;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getLast_dt(){
		return this.last_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_CO_1005_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_1005_LDM dm = (MC_CO_1005_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cd);
		cstmt.setString(5, dm.cdnm);
		cstmt.setString(6, dm.from_cd);
		cstmt.setString(7, dm.to_cd);
		cstmt.setString(8, dm.bgn_dt);
		cstmt.setString(9, dm.last_dt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_1005_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("cd = " + getCd());
        System.out.println("cdnm = " + getCdnm());
        System.out.println("from_cd = " + getFrom_cd());
        System.out.println("to_cd = " + getTo_cd());
        System.out.println("bgn_dt = " + getBgn_dt());
        System.out.println("last_dt = " + getLast_dt());
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
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
}
String from_cd = req.getParameter("from_cd");
if( from_cd == null){
	System.out.println(this.toString+" : from_cd is null" );
}else{
	System.out.println(this.toString+" : from_cd is "+from_cd );
}
String to_cd = req.getParameter("to_cd");
if( to_cd == null){
	System.out.println(this.toString+" : to_cd is null" );
}else{
	System.out.println(this.toString+" : to_cd is "+to_cd );
}
String bgn_dt = req.getParameter("bgn_dt");
if( bgn_dt == null){
	System.out.println(this.toString+" : bgn_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_dt is "+bgn_dt );
}
String last_dt = req.getParameter("last_dt");
if( last_dt == null){
	System.out.println(this.toString+" : last_dt is null" );
}else{
	System.out.println(this.toString+" : last_dt is "+last_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String from_cd = Util.checkString(req.getParameter("from_cd"));
String to_cd = Util.checkString(req.getParameter("to_cd"));
String bgn_dt = Util.checkString(req.getParameter("bgn_dt"));
String last_dt = Util.checkString(req.getParameter("last_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String from_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_cd")));
String to_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_cd")));
String bgn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_dt")));
String last_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setFrom_cd(from_cd);
dm.setTo_cd(to_cd);
dm.setBgn_dt(bgn_dt);
dm.setLast_dt(last_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 12:08:25 KST 2009 */