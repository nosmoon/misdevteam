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


public class FC_FUNC_4000_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String recp_dt;

	public FC_FUNC_4000_MDM(){}
	public FC_FUNC_4000_MDM(String cmpy_cd, String recp_dt){
		this.cmpy_cd = cmpy_cd;
		this.recp_dt = recp_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRecp_dt(){
		return this.recp_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4000_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4000_MDM dm = (FC_FUNC_4000_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.recp_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4000_MDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("recp_dt = " + getRecp_dt());
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
String recp_dt = req.getParameter("recp_dt");
if( recp_dt == null){
	System.out.println(this.toString+" : recp_dt is null" );
}else{
	System.out.println(this.toString+" : recp_dt is "+recp_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String recp_dt = Util.checkString(req.getParameter("recp_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String recp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRecp_dt(recp_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 06 11:32:19 KST 2009 */