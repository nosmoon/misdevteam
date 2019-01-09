/***************************************************************************************************
* ���ϸ� : SE_MO_SND_1811_LDM.java
* ��� : �Ǹ� - �߼۰���-�뼱����-�뼱��ȸ_����Ͽ�
 * �ۼ����� : 2017-01-07
 * �ۼ��� :   �弱��
***************************************************************************************************
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


public class SE_MO_SND_1811_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String route_clsf;
	public String bo_cd;

	public SE_MO_SND_1811_LDM(){}
	public SE_MO_SND_1811_LDM(String route_clsf, String bo_cd){
		this.route_clsf = route_clsf;
		this.bo_cd = bo_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSQL(){
		 return "{ call SP_SE_MO_SND_1811_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_MO_SND_1811_LDM dm = (SE_MO_SND_1811_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.route_clsf);
		cstmt.setString(4, dm.bo_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_MO_SND_1811_LDataSet();
	}



    public void print(){
        System.out.println("route_clsf = " + getRoute_clsf());
        System.out.println("bo_cd = " + getBo_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRoute_clsf(route_clsf);
dm.setBo_cd(bo_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 09 10:25:36 KST 2017 */