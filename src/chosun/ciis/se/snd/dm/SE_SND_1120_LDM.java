/***************************************************************************************************
* 파일명 : SE_SND_1120_LDM.java
* 기능 : 판매 - 발송관리 - 노선등록
 * 작성일자 : 2009.02.03
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


public class SE_SND_1120_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String route_clsf;
	public String route_cd;
	
	public SE_SND_1120_LDM(){}
	public SE_SND_1120_LDM(String cmpy_cd, String route_clsf, String route_cd){
		this.cmpy_cd = cmpy_cd;
		this.route_clsf = route_clsf;
		this.route_cd = route_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1120_L( ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1120_LDM dm = (SE_SND_1120_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.route_clsf);
		cstmt.setString(5, dm.route_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1120_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("route_clsf = " + getRoute_clsf());
        System.out.println("route_cd = " + getRoute_cd());
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
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String inwsp_send_yn = req.getParameter("inwsp_send_yn");
if( inwsp_send_yn == null){
	System.out.println(this.toString+" : inwsp_send_yn is null" );
}else{
	System.out.println(this.toString+" : inwsp_send_yn is "+inwsp_send_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String inwsp_send_yn = Util.checkString(req.getParameter("inwsp_send_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String inwsp_send_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("inwsp_send_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_clsf(route_clsf);
dm.setRoute_cd(route_cd);
dm.setInwsp_send_yn(inwsp_send_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 19:27:48 KST 2009 */