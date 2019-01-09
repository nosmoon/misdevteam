/***************************************************************************************************
* 파일명 : SE_SND_1240_ADM.java
* 기능 : 판매 - 발송관리 - 노선구분등록
* 작성일자 : 2009.05.14
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


public class SE_SND_1240_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String tar_route_clsf;
	public String src_route_clsf;
	public String incmg_pers_ip	;
	public String incmg_pers	;

	public SE_SND_1240_ADM(){}
	public SE_SND_1240_ADM(String cmpy_cd, String tar_route_clsf, String src_route_clsf, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.tar_route_clsf = tar_route_clsf;
		this.src_route_clsf = src_route_clsf;
		this.incmg_pers_ip 	= incmg_pers_ip	;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTar_route_clsf(String tar_route_clsf){
		this.tar_route_clsf = tar_route_clsf;
	}

	public void setSrc_route_clsf(String src_route_clsf){
		this.src_route_clsf = src_route_clsf;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTar_route_clsf(){
		return this.tar_route_clsf;
	}

	public String getSrc_route_clsf(){
		return this.src_route_clsf;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1240_A( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1240_ADM dm = (SE_SND_1240_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.tar_route_clsf);
		cstmt.setString(5, dm.src_route_clsf);
		cstmt.setString(6, dm.incmg_pers_ip	);
		cstmt.setString(7, dm.incmg_pers	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1240_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("tar_route_clsf 	= " + getTar_route_clsf	());
        System.out.println("src_route_clsf 	= " + getSrc_route_clsf	());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip	());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
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
String tar_route_clsf = req.getParameter("tar_route_clsf");
if( tar_route_clsf == null){
	System.out.println(this.toString+" : tar_route_clsf is null" );
}else{
	System.out.println(this.toString+" : tar_route_clsf is "+tar_route_clsf );
}
String src_route_clsf = req.getParameter("src_route_clsf");
if( src_route_clsf == null){
	System.out.println(this.toString+" : src_route_clsf is null" );
}else{
	System.out.println(this.toString+" : src_route_clsf is "+src_route_clsf );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tar_route_clsf = Util.checkString(req.getParameter("tar_route_clsf"));
String src_route_clsf = Util.checkString(req.getParameter("src_route_clsf"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tar_route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tar_route_clsf")));
String src_route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("src_route_clsf")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTar_route_clsf(tar_route_clsf);
dm.setSrc_route_clsf(src_route_clsf);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 11:19:51 KST 2009 */