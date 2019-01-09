/***************************************************************************************************
* 파일명 : SE_SND_1950_DDM.java
* 기능 : 판매 - 발송관리 - 발송마스터
* 작성일자 : 2009.02.11
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1950_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd               ;
	public String bo_cd                 ;
	public String send_plac_seq         ;
	public String incmg_pers			;
	
	public SE_SND_1950_DDM(){}
	
	public SE_SND_1950_DDM(String cmpy_cd, String bo_cd, String send_plac_seq, String incmg_pers ){
		this.cmpy_cd              = cmpy_cd             ;
		this.bo_cd                = bo_cd               ;
		this.send_plac_seq        = send_plac_seq       ;
		this.incmg_pers		      = incmg_pers			;
	}
	
	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1950_DDataSet();
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1950_D( ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1950_DDM dm = (SE_SND_1950_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd				  );
		cstmt.setString( 4, dm.bo_cd                  );
		cstmt.setString( 5, dm.send_plac_seq          );
		cstmt.setString( 6, dm.incmg_pers			  );
	}
	
	public void print(){
		System.out.println("cmpy_cd              =" + getCmpy_cd            ());
		System.out.println("bo_cd                =" + getBo_cd              ());
		System.out.println("send_plac_seq        =" + getSend_plac_seq      ());
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd	= cmpy_cd;
	}
	
	public void setBo_cd(String bo_cd){
		this.bo_cd		= bo_cd;
	}
	
	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq	= send_plac_seq;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers		= incmg_pers;
	}
	
	public String getCmpy_cd(){
		return cmpy_cd;
	}
	
	public String getBo_cd(){
		return bo_cd;
	}
	
	public String getSend_plac_seq(){
		return send_plac_seq;
	}
	
	public String getIncmg_pers(){
		return incmg_pers;
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cd_clsf = req.getParameter("cd_clsf");
if( cd_clsf == null){
	System.out.println(this.toString+" : cd_clsf is null" );
}else{
	System.out.println(this.toString+" : cd_clsf is "+cd_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cd_nm = req.getParameter("cd_nm");
if( cd_nm == null){
	System.out.println(this.toString+" : cd_nm is null" );
}else{
	System.out.println(this.toString+" : cd_nm is "+cd_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String cd_nm = Util.checkString(req.getParameter("cd_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
dm.setCd(cd);
dm.setCd_nm(cd_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 15:55:59 KST 2009 */