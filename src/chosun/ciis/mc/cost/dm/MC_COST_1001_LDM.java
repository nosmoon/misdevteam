/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String like_cd;
	public String cd_val;

	public MC_COST_1001_LDM(){}
	public MC_COST_1001_LDM(String cmpy_cd, String like_cd, String cd_val){
		this.cmpy_cd = cmpy_cd;
		this.like_cd = like_cd;
		this.cd_val = cd_val;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLike_cd(String like_cd){
		this.like_cd = like_cd;
	}

	public void setCd_val(String cd_val){
		this.cd_val = cd_val;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLike_cd(){
		return this.like_cd;
	}

	public String getCd_val(){
		return this.cd_val;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_1001_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_1001_LDM dm = (MC_COST_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.like_cd);
		cstmt.setString(5, dm.cd_val);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("like_cd = [" + getLike_cd() + "]");
		System.out.println("cd_val = [" + getCd_val() + "]");
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
String like_cd = req.getParameter("like_cd");
if( like_cd == null){
	System.out.println(this.toString+" : like_cd is null" );
}else{
	System.out.println(this.toString+" : like_cd is "+like_cd );
}
String cd_val = req.getParameter("cd_val");
if( cd_val == null){
	System.out.println(this.toString+" : cd_val is null" );
}else{
	System.out.println(this.toString+" : cd_val is "+cd_val );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String like_cd = Util.checkString(req.getParameter("like_cd"));
String cd_val = Util.checkString(req.getParameter("cd_val"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String like_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("like_cd")));
String cd_val = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_val")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setLike_cd(like_cd);
dm.setCd_val(cd_val);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 17 15:25:26 KST 2009 */