/***************************************************************************************************
* ���ϸ� : SE_SND_1140_LDM.java
* ��� : �Ǹ� - �߼۰��� - �뼱���
* �ۼ����� : 2009.02.03
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class SE_SND_1140_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	
	public SE_SND_1140_LDM(){}
	public SE_SND_1140_LDM(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1140_L( ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1140_LDM dm = (SE_SND_1140_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1140_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String inwsp_send_yn = Util.checkString(req.getParameter("inwsp_send_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String inwsp_send_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("inwsp_send_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_clsf(route_clsf);
dm.setRoute_cd(route_cd);
dm.setInwsp_send_yn(inwsp_send_yn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 20 19:27:48 KST 2009 */