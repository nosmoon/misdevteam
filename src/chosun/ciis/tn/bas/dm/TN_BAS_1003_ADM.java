/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String organidx;

	public TN_BAS_1003_ADM(){}
	public TN_BAS_1003_ADM(String cmpy_cd, String mode, String organidx){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.organidx = organidx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_1003_A(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_1003_ADM dm = (TN_BAS_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.organidx);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_1003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("organidx = [" + getOrganidx() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String organidx = req.getParameter("organidx");
if( organidx == null){
	System.out.println(this.toString+" : organidx is null" );
}else{
	System.out.println(this.toString+" : organidx is "+organidx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String organidx = Util.checkString(req.getParameter("organidx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String organidx = Util.Uni2Ksc(Util.checkString(req.getParameter("organidx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOrganidx(organidx);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 22 18:08:40 KST 2016 */