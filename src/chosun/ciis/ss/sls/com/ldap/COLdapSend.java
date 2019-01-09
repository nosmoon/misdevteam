/***************************************************************
* ���ϸ�		: COLdapSend.java
* ���			: Ÿ �ý��� ������ ����
* �ۼ�����		: 2005.03.08
* �ۼ���		: ������
***************************************************************/

package chosun.ciis.ss.sls.com.ldap;

import java.util.*;
import java.text.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
import netscape.ldap.*;
import java.net.*;

/**
 * Ldap ����� ó�� Class <br>
 * b2c���� �����Ͽ� ���
 */
public class COLdapSend {

	LDAPEntry findEntry = null;
	COLdapTransferStruct ls;

	private String SEARCH_BASE   = "o=chosun.com";

	public int status = -1;
    //���߰�
    /*
	private static String LDAP_HOST = "220.73.135.220"; 		// url
	private static int    LDAP_PORT = 391;		  	// port ��ȣ
	private static String MGR_DN = "cn=Directory Manager";	// manager id
	private static String MGR_PWD = "directory";			// manager pwd
   */
    //���

	private static String LDAP_HOST = "mldap.chosun.com"; 		// url
	//private static String LDAP_HOST = "220.73.135.103"; 		// url
	private static int    LDAP_PORT = 391;		  		// port ��ȣ
	private static String MGR_DN = "cn=Directory Manager";		// manager id
	private static String MGR_PWD = "pwldaptjqj";			// manager pwd


	public Vector vcReturn;				// �˻� ����� Return �� Vector

	private String attrName;
	private String aVal;

	// LDAP ���� ���� ����
	private final static String CONNECT_FAILED = "0";
	// LDAP �˻� ����
	private final static String SEARCH_ERROR = "1";
	// �����ID�� ã�� �� ����
	private final static String USER_NOT_FOUND = "2";
	// ��й�ȣ�� ��ġ���� ����
	private final static String INVALID_PASSWORD = "3";
	//�ش� Attribute�� �������� ����
	private final static String OBJECT_NOT_FOUND = "4";
	//�ش� Attribute�� ���ٱ����� ����.
	private final static String INSUFFICIENT_RIGHTS = "5";
	// ���ε� ����ڰ� �ƴ�.
	private final static String NOT_APPROVED = "6";
	// ��ȿ�Ⱓ�� �����������
	private final static String INVALID_PERIOD = "7";
	// ��Ÿ ����
	private final static String ETC_ERROR = "8";
	// ���� ����
	private final static String DELETE_ERROR = "9";

	/**
	 * Desc : ��ü ������. �⺻������ SEARCH_BASE�� o=chosun.com ���� ������
	*/
	public COLdapSend() {}

	/**
	 * Desc : ��ü ������. �⺻������ SEARCH_BASE�� o=chosun.com ���� ������
	 * @param LDAP_HOST LDAP���� Host ��
	 * @param LDAP_PORT LDAP���� Port ��ȣ
	*/
	public COLdapSend(String LDAP_HOST, int LDAP_PORT) {
		this(LDAP_HOST, LDAP_PORT, "o=chosun.com");
	}

	/**
	 * Desc : ��ü ������.
	 * @param LDAP_HOST   LDAP���� Host ��
	 * @param LDAP_PORT   LDAP���� Port ��ȣ
	 * @param SEARCH_BASE LDAP���� Search_base ����
	*/
	public COLdapSend(String LDAP_HOST, int LDAP_PORT, String SEARCH_BASE) {
		this.LDAP_HOST = LDAP_HOST;
		this.LDAP_PORT = LDAP_PORT;
		this.SEARCH_BASE = SEARCH_BASE;
	}

	/**
	 * Desc : Search Base ���� �޼ҵ�.
	 * @param SEARCH_BASE LDAP���� Search_base ����
	 * @exception Exception code string
	*/
	public void CSSetSearchBase(String SEARCH_BASE) {
		this.SEARCH_BASE = SEARCH_BASE;
	}

	/**
	 * Desc : Search Base Get �޼ҵ�.
	 * @return String SEARCH_BASE ������ �Ѱ���
	 * @exception Exception code string
	*/
	public String CSGetSearchBase() {
		return SEARCH_BASE;
	}

	/**
	 * Desc : OLAP ������ SP ȣ���Ѵ�.
	 * @param userid �����ID
	 * @param req : HttpServletRequest
	 * @param opt : �ɼ� (D: ���ѻ��� U: ���Ѻο�)
	 * @param chk_olap : ��������ڿ���
	 * @return result, �۾��Ϸ� true, �ƴϸ� false
	 * @exception Exception code string
	*/

	public void CSPutTransfer (String userid, String newpass) throws Exception {
		boolean result = false;
		String userDN = null;
		String ret = "";

		try {
			// ����� ���翩�� Ȯ���Ѵ�.
			userDN = CSGetDn (userid);

			if (userDN == null || userDN.equals(""))
				return;

			System.out.println ("[COLdapSend][CSPutTransfer][R] userDN " + userDN);

			// ����� ������ �˻��Ѵ�.
			CSSearchLdap("uid="+userid, "*");
			//System.out.println ("[COLdapSend][CSPutTransfer][R] cscmpycd " + ls.cscmpycd);
			//System.out.println( "[COLdapSend][CSSearchLdap][CSisExistAttr] csjobcd1 : " + ls.csjobcd.size());


			if (CSisExistAttr ("OLAP"))
				ret = sendFile (userid,newpass);

		} catch(Exception e) {
			// �۾� ���� �߻�
			System.out.println("[COLdapSend] Exception : " + e.toString());
		}

		//return result;
	}

	/**
	 * Desc : DN�� ��´�.
	 * @param userid �����ID
	 * @return DN, ã�� ���ϸ� null�� return
	 * @exception Exception code string
	*/
	public String CSGetDn(String userid) throws Exception {

		LDAPConnection ld = null;

		String attr[] = {"uid"};

		// LDAP ���� ����
		try {
			ld = new LDAPConnection();
			ld.connect(LDAP_HOST, LDAP_PORT, MGR_DN, MGR_PWD);

		} catch(LDAPException e) {
			// LDAP ���� ���� ����
			throw new Exception("[COLdapSend][CSGetDn] LDAP Connection Error type : " + CONNECT_FAILED);
		}

		String userDN = null;

		try {
			// �˻� ���� ����
			String FILTER= "(uid=" + userid + ")";
			LDAPSearchConstraints cons = ld.getSearchConstraints();
			cons.setBatchSize(1);

			LDAPSearchResults res = ld.search (SEARCH_BASE, LDAPConnection.SCOPE_SUB, FILTER, attr, false, cons);

			// �˻� ����� �����ϸ�...
			if(res.hasMoreElements()) {
				LDAPEntry findEntry = res.next();
				userDN = findEntry.getDN();
			}
		} catch(LDAPException e) {
			// LDAP �˻� ���� �߻�
			//System.out.println("[COLdapSend][CSGetDn] LDAP Error : " + e.getLDAPResultCode());
			System.out.println("[COLdapSend][CSGetDn] In uid : " + userid);
			System.out.println("[COLdapSend][CSGetDn] LDAP Error Desc : " + e.toString());

			throw new Exception(SEARCH_ERROR);
		} finally {
			try {
				if ((ld != null) && ld.isConnected()) {
					ld.disconnect();
				}
			} catch(LDAPException e) {
				System.out.println( "[COLdapSend][CSGetDn] Finally Error: " + e.toString() );
			}
		}

		return userDN;
	}

	/**
	* Desc : Ldap ���� �˻��ϴ� METHOD �� �˻������ Vector �� �Ѱ��ش�. �˻��ϰ��� �ϴ� attribute�� ������ ������ ��쿡�� attributeName�� ����Ѵ�.
	* @param filter �˻��ϰ��� �ϴ� ����
	* @param attributeName �˻��ϰ��� �ϴ� attribute�� ����Ʈ�� "|" �� �����ϸ� "*" �� ���� ��� attribute�� �˻���
	* @return Vector COLdapTransferStruct Object�� ��� �ִ� Vector
	* @exception Exception code string
	*/
	public void CSSearchLdap(String filter, String attributeName) throws Exception
	{
		LDAPConnection ld = null;

		// LDAP ���� ����
		try {
			ld = new LDAPConnection();
			ld.connect(LDAP_HOST, LDAP_PORT, MGR_DN, MGR_PWD);
		} catch(LDAPException eldap) {
		// LDAP ���� ���� ����
			throw new Exception("[COLdapSend][CSSearchLdap] LDAP Connection Error type : " + CONNECT_FAILED);
		}

		// whatSearch �� | �� �Ľ����Ŀ� ���� �迭
		String[] arrAttributeName = null;

		try {
			boolean  isSearchAll = false;

			// ã�� ������ arrWhatSearch �� �ִ´�.
			if(attributeName.equals("*"))  {
				isSearchAll = true;
				arrAttributeName = null;
			} else {
				StringTokenizer st = new StringTokenizer (attributeName, "|");
				arrAttributeName =  new String[st.countTokens()];

				int sizeWhatSearch =0;
				while (st.hasMoreTokens()) {
					arrAttributeName[sizeWhatSearch] = st.nextToken().trim();
					sizeWhatSearch++;
				}
			}

			// �˻��������� LDAP �˻��Ѵ�
			LDAPSearchConstraints cons = ld.getSearchConstraints();
			cons.setBatchSize( 1 );
			LDAPSearchResults res = ld.search( SEARCH_BASE,
							   LDAPConnection.SCOPE_SUB,
							   filter,
							   arrAttributeName,
							   false,
							   cons);

			// �˻���� ���ļ� cscmpycd, csofficd, csboksnm, uid, csincmpydt
			//String[]  sortAttrs = {"cscmpycd","csofficd", "csboksnm","uid","csincmpydt"};
			//boolean[] ascending = {true, true, true, true, true};
			//res.sort( new LDAPCompareAttrNames(sortAttrs, ascending) );

			vcReturn = new Vector();

			while ( res.hasMoreElements() ) {

				try {
					findEntry = res.next();

				} catch ( LDAPReferralException e ) {
					System.out.print( "[COLdapSend][CSSearchLdap] Search reference: " );

					LDAPUrl refUrls[] = e.getURLs();
					for (int i=0; i<refUrls.length; i++) {
						System.out.print( "\t" + refUrls[i].getUrl() );
					}
					continue;
				} catch ( LDAPException e ) {
					System.out.println( "[COLdapSend][CSSearchLdap] Error: " + e.toString() );
					continue;
				}

				LDAPAttributeSet findAttrs = findEntry.getAttributeSet();
				Enumeration enumAttrs = findAttrs.getAttributes();

				ls = new COLdapTransferStruct(); // ldap data  �� ������ Ʋ�� �����ϴ� ����ü

				while ( enumAttrs.hasMoreElements() ) {
					LDAPAttribute anAttr = (LDAPAttribute)enumAttrs.nextElement();
					attrName = anAttr.getName(); // �˻��� attribute Name

					// ��ü �˻��Ҷ�
					if(isSearchAll) {
						Enumeration enumVals = anAttr.getStringValues();

						if (enumVals != null) {
							while ( enumVals.hasMoreElements() ) {
								aVal = ( String )enumVals.nextElement();
								//System.out.println ("[" + attrName + "] : " + aVal);

								inputStruct(attrName, aVal);
							}
						}
					}	// ���ǰ˻��� �Ҷ� �迭�� �Ѿ�� attributeName �� ���鼭 ã�´�.
					else {

						for(int  i = 0 ; i< arrAttributeName.length; i++) {

							if(attrName.equals(arrAttributeName[i])) {
								Enumeration enumVals = anAttr.getStringValues();

								if (enumVals != null) {
									while ( enumVals.hasMoreElements() ) {
										aVal = ( String )enumVals.nextElement();

										inputStruct(attrName, aVal);
									}
								}
							}
						}
					} // end if
				}

				vcReturn.addElement(ls); // Structure Input
			}
			status = 0;

			ld.disconnect();	//2006.08.14

		} catch( LDAPException e ) {
			//System.out.println("[COLdapSend][CSSearchLdap] LDAP Error : " + e.getLDAPResultCode());
			System.out.println("[COLdapSend][CSSearchLdap] In filter : " + filter);
			System.out.println("[COLdapSend][CSSearchLdap] LDAP Error Desc : " + e.toString());

			throw new Exception(SEARCH_ERROR);
		} finally {
			try {
				if ((ld != null) && ld.isConnected()) {
					ld.disconnect();
				}
			} catch(LDAPException e) {
				System.out.println( "[COLdapSend][CSSearchLdap] Finally Error: " + e.toString() );
			}
		}

		//return vcReturn;
	}

	/**
	* Desc : �ý��۱����� ���� ��������� ���θ� �˻��Ѵ�.
	* @param type : �ý��� ����
	* @return boolean : ���ѿ���
	* @exception Exception code string
	*/
	public boolean CSisExistAttr (String type) {
		boolean result = false;
		//System.out.println( "[COLdapSend][CSSearchLdap][CSisExistAttr] " + type);
		//System.out.println( "[COLdapSend][CSSearchLdap][CSisExistAttr] csjobcd : " + ls.csjobcd.size());

		if (type.equals("OLAP")) {
			for (int i = 0; i < ls.csjobcd.size(); i++) {

				//System.out.println (String.valueOf(ls.csjobcd.get(i)));
				if (String.valueOf(ls.csjobcd.get(i)).startsWith("O")) {
					result = true;
					break;
				}
			}
		}

		//result = false;

		return result;
	}


	/**
	* Desc : OLAP �ý��ۿ� �����͸� �����Ѵ�.
	* @param req : HttpServletRequest
	* @param opt : �ɼ� (D: ���ѻ��� U: ���Ѻο�)
	* @param chk_olap : ��������ڿ���
	* @exception Exception code string
	*/
	public String sendFile (String userid,String newpass)
	{
		boolean result = false;
		File pfile;
		String filePath = "", fileName = "", fileDate = "", comm = "", sendTxt = "", tmp_jobnm = "";
		StringBuffer str = new StringBuffer();

		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmss");
		fileDate = sf.format(new java.util.Date());

		filePath = getProp ("CLASS_PATH") + "com/ldap/OLAP/";
		fileName = "userDown_bat.txt" ;

		try {

			/*
			 * userDown_bat.txt ���� ����
			 *
			 * SetUserBasicSignonProperty,��ȫ�浿userid��,��userid��,"Password","����Password"
			*/
			//tmp_jobnm = "SetUserBasicSignonProperty,\"" + ls.cn+ls.uid +"\",\""+ ls.uid +"\",\"Password\""+",\""+(newpass).toLowerCase()+"\" \r\n";
			//str.append("SetUserBasicSignonProperty,\"" + ls.cn + ls.uid + "\",\""+ ls.uid +"\",\"Password\""+",\""+(newpass).toLowerCase()+"\"\r\n");
			str.append("SetUserBasicSignonProperty,\"" + ls.cn + ls.uid + "\",\""+ ls.uid +"\",\"Password\""+",\"pwdhffoqsvr\"\r\n");

			sendTxt = str.toString();
			System.out.println("[COLdapSend][sendFile] sendTxt : \n" + sendTxt);
			//if (sendTxt != null)		return "";

            //System.out.println("[COLdapSend][sendFile] filePath : \n" + filePath + fileName);
			// ������ �����Ѵٸ� ����?
			pfile = new File (filePath + fileName);
			if (!pfile.exists()) {
				pfile.createNewFile();

				FileWriter fw = new FileWriter(pfile, true);
				BufferedWriter bw = new BufferedWriter(fw, 1024);

				PrintWriter pw = new PrintWriter(bw, true);
				pw.print(sendTxt);

				pw.close();
				pw.close();
				fw.close();
			}

			//��������
			FtpClientApp fca = new FtpClientApp();
			result = fca.FtpClientApp("");

			if (!result) {
				System.out.println("[COLdapSend][sendFile] ftpClientApp fail");
				return "error";
			}

			//��ġ����
			OLAPBatchExec exec = new OLAPBatchExec();
			String ret = exec.runOLAPBatch();

			//������ ���
			if (ret != null && ret.equals("N")) {
				System.out.println("[COLdapSend][sendFile] execute Batch fail");
				return "error";
			}

			//���Ϲ��
			// > mv userDown_bat.txt bak/userDown_bat.txt.yyyymmddhhmmss
            // was/branch/applications/www/WEB-INF/classes/pub/com/ldap/OLAP/bak �� �־�� ��
			comm = "mv " + filePath + fileName + " " + filePath + "bak/" + fileName + "." + fileDate;
			Process proc = Runtime.getRuntime().exec(comm);

		} catch (IOException e) {
			System.out.println("[COLdapSend][sendFile] IOException : "+ e.toString());
		} catch (Exception e) {
			System.out.println("[COLdapSend][sendFile] Exception : "+ e.toString());
		}

		return "";
	}


	/**
	 * Desc : �˻��� ������ ���� COLdapTransferStruct����ü�� attribute Value Insert
	 * @param attrName  �ش� Attribute Name
	 * @param attrVal   �ش� Attribute ��
	 * @exception Exception code string
	*/
	public void inputStruct(String attrName, String attrVal) {

		if(attrName.equalsIgnoreCase("csprn"))  {
			ls.csprn = attrVal;
		} else if(attrName.equalsIgnoreCase("sn"))  {
			ls.sn = attrVal;
		} else if(attrName.equalsIgnoreCase("givenname"))  {
			ls.givenname = attrVal;
		} else if(attrName.equalsIgnoreCase("cn"))  {
			ls.cn = attrVal;
		} else if(attrName.equalsIgnoreCase("cshanjanm"))  {
			ls.cshanjanm = attrVal;
		} else if(attrName.equalsIgnoreCase("csenglnm"))  {
			ls.csenglnm = attrVal;
		} else if(attrName.equalsIgnoreCase("uid"))  {
			ls.uid = attrVal;
		} else if(attrName.equalsIgnoreCase("employeenumber"))  {
			ls.employeenumber = attrVal;
		} else if(attrName.equalsIgnoreCase("userPassword"))  {
			ls.userPassword = attrVal;
		} else if(attrName.equalsIgnoreCase("departmentnumber"))  {
			ls.departmentnumber = attrVal;
		} else if(attrName.equalsIgnoreCase("ou"))  {
			ls.ou = attrVal;
		} else if(attrName.equalsIgnoreCase("employeetype"))  {
			ls.employeetype = attrVal;
		} else if(attrName.equalsIgnoreCase("cscmpycd"))  {
			ls.cscmpycd = attrVal;
		} else if(attrName.equalsIgnoreCase("o"))  {
			ls.o = attrVal;
		} else if(attrName.equalsIgnoreCase("csjikryl"))  {
			ls.csjikryl = attrVal;
		} else if(attrName.equalsIgnoreCase("csjikgun"))  {
			ls.csjikgun = attrVal;
		} else if(attrName.equalsIgnoreCase("csjikmu"))  {
			ls.csjikmu = attrVal;
		} else if(attrName.equalsIgnoreCase("csoctgr"))  {
			ls.csoctgr = attrVal;
		} else if(attrName.equalsIgnoreCase("csposicd1"))  {
			ls.csposicd1 = attrVal;
		} else if(attrName.equalsIgnoreCase("csposinm1"))  {
			ls.csposinm1 = attrVal;
		} else if(attrName.equalsIgnoreCase("csposicd2"))  {
			ls.csposicd2 = attrVal;
		} else if(attrName.equalsIgnoreCase("csposinm2"))  {
			ls.csposinm2 = attrVal;
		} else if(attrName.equalsIgnoreCase("csdutycd"))  {
			ls.csdutycd = attrVal;
		} else if(attrName.equalsIgnoreCase("csdutynm"))  {
			ls.csdutynm = attrVal;
		} else if(attrName.equalsIgnoreCase("csincmpydt"))  {
			ls.csincmpydt = attrVal;
		} else if(attrName.equalsIgnoreCase("csdealbankcd"))  {
			ls.csdealbankcd = attrVal;
		} else if(attrName.equalsIgnoreCase("csdealbanknm"))  {
			ls.csdealbanknm = attrVal;
		} else if(attrName.equalsIgnoreCase("csacctno"))  {
			ls.csacctno = attrVal;
		} else if(attrName.equalsIgnoreCase("mobile"))  {
			ls.mobile = attrVal;
		} else if(attrName.equalsIgnoreCase("mail"))  {
			ls.mail = attrVal;
		} else if(attrName.equalsIgnoreCase("cshomeaddr"))  {
			ls.cshomeaddr = attrVal;
		} else if(attrName.equalsIgnoreCase("cshomeaddr2"))  {
			ls.cshomeaddr2 = attrVal;
		} else if(attrName.equalsIgnoreCase("homephone"))  {
			ls.homephone = attrVal;
		} else if(attrName.equalsIgnoreCase("csselldeptcd"))  {
			ls.csselldeptcd = attrVal;
		} else if(attrName.equalsIgnoreCase("csselldeptnm"))  {
			ls.csselldeptnm = attrVal;
		} else if(attrName.equalsIgnoreCase("csbocd"))  {
			ls.csbocd = attrVal;
		} else if(attrName.equalsIgnoreCase("csbonm"))  {
			ls.csbonm = attrVal;
		} else if(attrName.equalsIgnoreCase("csareacd"))  {
			ls.csareacd = attrVal;
		} else if(attrName.equalsIgnoreCase("csareanm"))  {
			ls.csareanm = attrVal;
		} else if(attrName.equalsIgnoreCase("cshrdeptcd"))  {
			ls.cshrdeptcd = attrVal;
		} else if(attrName.equalsIgnoreCase("cshrdeptnm"))  {
			ls.cshrdeptnm = attrVal;
		} else if(attrName.equalsIgnoreCase("csboclsfcd"))  {
			ls.csboclsfcd = attrVal;
		} else if(attrName.equalsIgnoreCase("csboclsfnm"))  {
			ls.csboclsfnm = attrVal;
		} else if(attrName.equalsIgnoreCase("csbillgroupid"))  {
			ls.csbillgroupid = attrVal;
		} else if(attrName.equalsIgnoreCase("csbillgrouptype"))  {
			ls.csbillgrouptype = attrVal;
		} else if(attrName.equalsIgnoreCase("csbillincode"))  {
			ls.csbillincode = attrVal;
		} else if(attrName.equalsIgnoreCase("csmanageryn"))  {
			ls.csmanageryn = attrVal;
		} else if(attrName.equalsIgnoreCase("csusertype"))  {
			ls.csusertype = attrVal;
		} else if(attrName.equalsIgnoreCase("description"))  {
			ls.description = attrVal;
		} else if(attrName.equalsIgnoreCase("csofficd"))  {
			ls.csofficd = attrVal;
		} else if(attrName.equalsIgnoreCase("csoffinm"))  {
			ls.csoffinm = attrVal;
		} else if(attrName.equalsIgnoreCase("csbokscd"))  {
			ls.csbokscd = attrVal;
		} else if(attrName.equalsIgnoreCase("csboksnm"))  {
			ls.csboksnm = attrVal;
		} else if(attrName.equalsIgnoreCase("cshomezipcode"))  {
			ls.cshomezipcode = attrVal;
		} else if(attrName.equalsIgnoreCase("csoutcmpydt"))  {
			ls.csoutcmpydt = attrVal;
		} else if(attrName.equalsIgnoreCase("csacctnm"))  {
			ls.csacctnm = attrVal;
		} else if(attrName.equalsIgnoreCase("cslastinfologin"))  {
			ls.cslastinfologin = attrVal;
		} else if(attrName.equalsIgnoreCase("csempcmpycd"))  {
			ls.csempcmpycd = attrVal;
		} else if(attrName.equalsIgnoreCase("csempcmpynm"))  {
			ls.csempcmpynm = attrVal;
		} else if(attrName.equalsIgnoreCase("csbrchofficd"))  {
			ls.csbrchofficd = attrVal;
		} else if(attrName.equalsIgnoreCase("csbrchoffinm"))  {
			ls.csbrchoffinm = attrVal;
		} else if(attrName.equalsIgnoreCase("carlicense"))  {
			ls.carlicense = attrVal;
		} else if(attrName.equalsIgnoreCase("csmangareacd"))  {
			ls.csmangareacd.addElement(attrVal);
		} else if(attrName.equalsIgnoreCase("csmangareanm"))  {
			ls.csmangareanm.addElement(attrVal);
		} else if(attrName.equalsIgnoreCase("csjobcd"))  {
			ls.csjobcd.addElement(attrVal);
		} else if(attrName.equalsIgnoreCase("csjobnm"))  {
			ls.csjobnm.addElement(attrVal);
		} else if(attrName.equalsIgnoreCase("csdealdeptcd"))  {
			ls.csdealdeptcd.addElement(attrVal);
		} else if(attrName.equalsIgnoreCase("csdealdeptnm"))  {
			ls.csdealdeptnm.addElement(attrVal);
		}
	}

	/**
	 * Desc : ���ڸ� �������ش�
	 * @param str :	������ ���ڿ�
	 * @param a :	������ ���ڿ�
	 * @param b :	����� ���ڿ�
	 * @return result : ����� ���ڿ�
	 * @exception Exception code string
	*/
	public static String aTob( String str, String a, String b )
	{
		if( str == null ) return null;

		String tmp_str = "";
		int i = 0; int j = i;
		while( (i = str.indexOf(a,i)) != -1 )
		{
			tmp_str = tmp_str + str.substring(j,i) + b;
			i += a.length();
			j = i;
		}
		tmp_str = tmp_str + str.substring(j,str.length());

		return new String (tmp_str);
	}

	/**
	 * Desc : property ���� �о����
	 * @param var : ������
	 * @return val : property ��
	 * @exception Exception code string
	*/
	public static String getProp (String var)
	{
		String val = "";

		try {
			Properties prop = new Properties();

	        //FileInputStream fin = new FileInputStream("properties");
            //�� �ý��ۺ��� ��� ���� �� ���� ���ε� olap.properties
            FileInputStream fin = new FileInputStream("/was/salesdept/applications/www/WEB-INF/classes/sls/com/ldap/olap.properties");

	        prop.load(fin);
	        fin.close();

			val = prop.getProperty(var);
		}
		catch (Exception e) {
			System.out.println("[getProp] Exception : "+ e.toString());
		}

		return val;
	}
}

/***********************************************************
class COLdapTransferStruct {

	public String csprn	 		= null;		// �ֹι�ȣ(xxxxxxyyyyyyy ����)
	public String sn			= null; 	// *����
	public String givenname			= null; 	// *����
	public String cn			= null; 	// *����
	public String cshanjanm			= null;		// ����(����, �������)
	public String csenglnm			= null;		// ����(����, ��������)
	public String uid			= null; 	// ���̵�
	public String employeenumber 		= null;		// ���
	public String userPassword		= null; 	// *��ȣ(SHA)
	public String departmentnumber		= null;		// ����ٹ��μ��ڵ�
	public String ou			= null;		// ���� �ٹ� �μ���
	public String employeetype 		= null;		// ��������ڵ�
	public String cscmpycd			= null; 	// ȸ���ڵ�
	public String o				= null; 	// ȸ���
	public String csjikryl			= null; 	// ������
	public String csjikgun			= null; 	// ������
	public String csjikmu			= null; 	// ������
	public String csoctgr			= null; 	// ������
	public String csposicd1			= null;		// ��å�ڵ�1
	public String csposinm1			= null;		// ��å��1
	public String csposicd2			= null;		// ��å�ڵ�2
	public String csposinm2			= null;		// ��å��2
	public String csdutycd			= null;		// �ٹ����ڵ�
	public String csdutynm			= null;		// �ٹ�����
	public String csincmpydt		= null;		// �Ի�����(yyyymmdd ����)
	public String csdealbankcd		= null;		// �ŷ������ڵ�
	public String csdealbanknm		= null;		// �ŷ������
	public String csacctno			= null;		// ���¹�ȣ(000-0000-0000-0000 ����)
	public String mobile			= null;		// �޴���(011-2222-3333  ����)
	public String mail			= null; 	// �̸����ּ�
	public String cshomeaddr		= null;		// �ּ�
	public String cshomeaddr2		= null;		// ���ּ�
	public String homephone			= null;		// �������� ��ȭ��ȣ(111-2222-3333  ����)
	public Vector csmangareacd		= new Vector();		// ���������ڵ� (multi-value)
	public Vector csmangareanm		= new Vector();		// ���������� (multi-value)
	public String csselldeptcd		= null;		// �Ǹźμ��ڵ�
	public String csselldeptnm		= null;		// �Ǹźμ���
	public String csbocd			= null;		// �����ڵ�
	public String csbonm			= null;		// ������
	public String csareacd			= null;		// �����ڵ�
	public String csareanm			= null;		// ������
	public String cshrdeptcd		= null;		// �λ�μ��ڵ�
	public String cshrdeptnm		= null;		// �λ�μ���
	public String csboclsfcd		= null;		// ���������ڵ�
	public String csboclsfnm		= null;		// �������и�
	public String csbillgroupid		= null;		// �����׷�ID
	public String csbillgrouptype		= null;		// �����׷�����
	public String csbillincode		= null;		// �����Ҽ��ڵ�
	public Vector csjobcd			= new Vector();		// �����ڵ� (multi-value)
	public Vector csjobnm			= new Vector();		// �����ڵ�/�� (multi-value, �����ڵ�|�� ǥ��  ��) 000|���ϸ��������� ����)
	public String csmanageryn		= null;		// �μ��忩��
	public String csusertype		= null;		//���������
	public String description		= null;		//���������
	public String csofficd			= null;		// ���ڵ�
	public String csoffinm			= null;		// ����
	public String csbokscd			= null;		// ���ڵ�
	public String csboksnm			= null;		// �θ�
	public Vector csdealdeptcd		= new Vector();		// �����μ��ڵ� (multi-value)
	public Vector csdealdeptnm		= new Vector();		// �����μ��� (multi-value, �����μ��ڵ�|�����μ��� ǥ��  ��) 3105|����2�� ����)
	public String cshomezipcode		= null;		// ���� �����ȣ(111-222 ����)
	public String csoutcmpydt		= null;		// �������(yyyymmdd ����)
	public String csacctnm			= null;		// ������
	public String cslastinfologin		= null;		// ����������
	public String csempcmpycd		= null;		// �ٹ���ȸ���ڵ�
	public String csempcmpynm		= null;		// �ٹ���ȸ���
	public String csbrchofficd		= null;		// �����ڵ�
	public String csbrchoffinm		= null;		// �����
	public String carlicense		= null;		// ���ʷα��� �� �Ǵ� pwd ���� �� (16777216 : �α������� �ʾҽ�)
}
***********************************************************/
