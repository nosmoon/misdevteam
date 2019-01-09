/***************************************************************
* 파일명		: COLdapSend.java
* 기능			: 타 시스템 데이터 전송
* 작성일자		: 2005.03.08
* 작성자		: 조은영
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
 * Ldap 사용자 처리 Class <br>
 * b2c용을 수정하여 사용
 */
public class COLdapSend {

	LDAPEntry findEntry = null;
	COLdapTransferStruct ls;

	private String SEARCH_BASE   = "o=chosun.com";

	public int status = -1;
    //개발계
    /*
	private static String LDAP_HOST = "220.73.135.220"; 		// url
	private static int    LDAP_PORT = 391;		  	// port 번호
	private static String MGR_DN = "cn=Directory Manager";	// manager id
	private static String MGR_PWD = "directory";			// manager pwd
   */
    //운영계

	private static String LDAP_HOST = "mldap.chosun.com"; 		// url
	//private static String LDAP_HOST = "220.73.135.103"; 		// url
	private static int    LDAP_PORT = 391;		  		// port 번호
	private static String MGR_DN = "cn=Directory Manager";		// manager id
	private static String MGR_PWD = "pwldaptjqj";			// manager pwd


	public Vector vcReturn;				// 검색 결과를 Return 할 Vector

	private String attrName;
	private String aVal;

	// LDAP 서버 접속 실패
	private final static String CONNECT_FAILED = "0";
	// LDAP 검색 에러
	private final static String SEARCH_ERROR = "1";
	// 사용자ID를 찾을 수 없음
	private final static String USER_NOT_FOUND = "2";
	// 비밀번호가 일치하지 않음
	private final static String INVALID_PASSWORD = "3";
	//해당 Attribute가 존재하지 않음
	private final static String OBJECT_NOT_FOUND = "4";
	//해당 Attribute에 접근권한이 없슴.
	private final static String INSUFFICIENT_RIGHTS = "5";
	// 승인된 사용자가 아님.
	private final static String NOT_APPROVED = "6";
	// 유효기간이 지난사용자임
	private final static String INVALID_PERIOD = "7";
	// 기타 오류
	private final static String ETC_ERROR = "8";
	// 삭제 오류
	private final static String DELETE_ERROR = "9";

	/**
	 * Desc : 객체 생성자. 기본적으로 SEARCH_BASE를 o=chosun.com 으로 지정함
	*/
	public COLdapSend() {}

	/**
	 * Desc : 객체 생성자. 기본적으로 SEARCH_BASE를 o=chosun.com 으로 지정함
	 * @param LDAP_HOST LDAP서버 Host 명
	 * @param LDAP_PORT LDAP서버 Port 번호
	*/
	public COLdapSend(String LDAP_HOST, int LDAP_PORT) {
		this(LDAP_HOST, LDAP_PORT, "o=chosun.com");
	}

	/**
	 * Desc : 객체 생성자.
	 * @param LDAP_HOST   LDAP서버 Host 명
	 * @param LDAP_PORT   LDAP서버 Port 번호
	 * @param SEARCH_BASE LDAP서버 Search_base 지정
	*/
	public COLdapSend(String LDAP_HOST, int LDAP_PORT, String SEARCH_BASE) {
		this.LDAP_HOST = LDAP_HOST;
		this.LDAP_PORT = LDAP_PORT;
		this.SEARCH_BASE = SEARCH_BASE;
	}

	/**
	 * Desc : Search Base 설정 메소드.
	 * @param SEARCH_BASE LDAP서버 Search_base 지정
	 * @exception Exception code string
	*/
	public void CSSetSearchBase(String SEARCH_BASE) {
		this.SEARCH_BASE = SEARCH_BASE;
	}

	/**
	 * Desc : Search Base Get 메소드.
	 * @return String SEARCH_BASE 정보를 넘겨줌
	 * @exception Exception code string
	*/
	public String CSGetSearchBase() {
		return SEARCH_BASE;
	}

	/**
	 * Desc : OLAP 스스템 SP 호출한다.
	 * @param userid 사용자ID
	 * @param req : HttpServletRequest
	 * @param opt : 옵션 (D: 권한삭제 U: 권한부여)
	 * @param chk_olap : 기존사용자여부
	 * @return result, 작업완료 true, 아니면 false
	 * @exception Exception code string
	*/

	public void CSPutTransfer (String userid, String newpass) throws Exception {
		boolean result = false;
		String userDN = null;
		String ret = "";

		try {
			// 사용자 존재여부 확인한다.
			userDN = CSGetDn (userid);

			if (userDN == null || userDN.equals(""))
				return;

			System.out.println ("[COLdapSend][CSPutTransfer][R] userDN " + userDN);

			// 사용자 정보를 검색한다.
			CSSearchLdap("uid="+userid, "*");
			//System.out.println ("[COLdapSend][CSPutTransfer][R] cscmpycd " + ls.cscmpycd);
			//System.out.println( "[COLdapSend][CSSearchLdap][CSisExistAttr] csjobcd1 : " + ls.csjobcd.size());


			if (CSisExistAttr ("OLAP"))
				ret = sendFile (userid,newpass);

		} catch(Exception e) {
			// 작업 에러 발생
			System.out.println("[COLdapSend] Exception : " + e.toString());
		}

		//return result;
	}

	/**
	 * Desc : DN을 얻는다.
	 * @param userid 사용자ID
	 * @return DN, 찾지 못하면 null을 return
	 * @exception Exception code string
	*/
	public String CSGetDn(String userid) throws Exception {

		LDAPConnection ld = null;

		String attr[] = {"uid"};

		// LDAP 서버 접속
		try {
			ld = new LDAPConnection();
			ld.connect(LDAP_HOST, LDAP_PORT, MGR_DN, MGR_PWD);

		} catch(LDAPException e) {
			// LDAP 서버 접속 실패
			throw new Exception("[COLdapSend][CSGetDn] LDAP Connection Error type : " + CONNECT_FAILED);
		}

		String userDN = null;

		try {
			// 검색 필터 설정
			String FILTER= "(uid=" + userid + ")";
			LDAPSearchConstraints cons = ld.getSearchConstraints();
			cons.setBatchSize(1);

			LDAPSearchResults res = ld.search (SEARCH_BASE, LDAPConnection.SCOPE_SUB, FILTER, attr, false, cons);

			// 검색 결과가 존재하면...
			if(res.hasMoreElements()) {
				LDAPEntry findEntry = res.next();
				userDN = findEntry.getDN();
			}
		} catch(LDAPException e) {
			// LDAP 검색 에러 발생
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
	* Desc : Ldap 에서 검색하는 METHOD 로 검색결과를 Vector 로 넘겨준다. 검색하고자 하는 attribute가 별도로 존재할 경우에는 attributeName에 명시한다.
	* @param filter 검색하고자 하는 필터
	* @param attributeName 검색하고자 하는 attribute의 리스트로 "|" 로 구분하며 "*" 인 경우는 모든 attribute를 검색함
	* @return Vector COLdapTransferStruct Object를 담고 있는 Vector
	* @exception Exception code string
	*/
	public void CSSearchLdap(String filter, String attributeName) throws Exception
	{
		LDAPConnection ld = null;

		// LDAP 서버 접속
		try {
			ld = new LDAPConnection();
			ld.connect(LDAP_HOST, LDAP_PORT, MGR_DN, MGR_PWD);
		} catch(LDAPException eldap) {
		// LDAP 서버 접속 실패
			throw new Exception("[COLdapSend][CSSearchLdap] LDAP Connection Error type : " + CONNECT_FAILED);
		}

		// whatSearch 를 | 로 파싱한후에 넣을 배열
		String[] arrAttributeName = null;

		try {
			boolean  isSearchAll = false;

			// 찾는 조건을 arrWhatSearch 에 넣는다.
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

			// 검색조건으로 LDAP 검색한다
			LDAPSearchConstraints cons = ld.getSearchConstraints();
			cons.setBatchSize( 1 );
			LDAPSearchResults res = ld.search( SEARCH_BASE,
							   LDAPConnection.SCOPE_SUB,
							   filter,
							   arrAttributeName,
							   false,
							   cons);

			// 검색결과 정렬순 cscmpycd, csofficd, csboksnm, uid, csincmpydt
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

				ls = new COLdapTransferStruct(); // ldap data  를 넣을때 틀을 제공하는 구조체

				while ( enumAttrs.hasMoreElements() ) {
					LDAPAttribute anAttr = (LDAPAttribute)enumAttrs.nextElement();
					attrName = anAttr.getName(); // 검색할 attribute Name

					// 전체 검색할때
					if(isSearchAll) {
						Enumeration enumVals = anAttr.getStringValues();

						if (enumVals != null) {
							while ( enumVals.hasMoreElements() ) {
								aVal = ( String )enumVals.nextElement();
								//System.out.println ("[" + attrName + "] : " + aVal);

								inputStruct(attrName, aVal);
							}
						}
					}	// 조건검색을 할때 배열로 넘어온 attributeName 을 돌면서 찾는다.
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
	* Desc : 시스템권한을 가진 사용자인지 여부를 검색한다.
	* @param type : 시스템 유형
	* @return boolean : 권한여부
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
	* Desc : OLAP 시스템에 데이터를 전송한다.
	* @param req : HttpServletRequest
	* @param opt : 옵션 (D: 권한삭제 U: 권한부여)
	* @param chk_olap : 기존사용자여부
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
			 * userDown_bat.txt 파일 생성
			 *
			 * SetUserBasicSignonProperty,”홍길동userid”,”userid”,"Password","실제Password"
			*/
			//tmp_jobnm = "SetUserBasicSignonProperty,\"" + ls.cn+ls.uid +"\",\""+ ls.uid +"\",\"Password\""+",\""+(newpass).toLowerCase()+"\" \r\n";
			//str.append("SetUserBasicSignonProperty,\"" + ls.cn + ls.uid + "\",\""+ ls.uid +"\",\"Password\""+",\""+(newpass).toLowerCase()+"\"\r\n");
			str.append("SetUserBasicSignonProperty,\"" + ls.cn + ls.uid + "\",\""+ ls.uid +"\",\"Password\""+",\"pwdhffoqsvr\"\r\n");

			sendTxt = str.toString();
			System.out.println("[COLdapSend][sendFile] sendTxt : \n" + sendTxt);
			//if (sendTxt != null)		return "";

            //System.out.println("[COLdapSend][sendFile] filePath : \n" + filePath + fileName);
			// 파일이 존재한다면 중지?
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

			//파일전송
			FtpClientApp fca = new FtpClientApp();
			result = fca.FtpClientApp("");

			if (!result) {
				System.out.println("[COLdapSend][sendFile] ftpClientApp fail");
				return "error";
			}

			//배치실행
			OLAPBatchExec exec = new OLAPBatchExec();
			String ret = exec.runOLAPBatch();

			//실패할 경우
			if (ret != null && ret.equals("N")) {
				System.out.println("[COLdapSend][sendFile] execute Batch fail");
				return "error";
			}

			//파일백업
			// > mv userDown_bat.txt bak/userDown_bat.txt.yyyymmddhhmmss
            // was/branch/applications/www/WEB-INF/classes/pub/com/ldap/OLAP/bak 이 있어야 함
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
	 * Desc : 검색된 정보의 값을 COLdapTransferStruct구조체에 attribute Value Insert
	 * @param attrName  해당 Attribute Name
	 * @param attrVal   해당 Attribute 값
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
	 * Desc : 문자를 변경해준다
	 * @param str :	변경할 문자열
	 * @param a :	변경할 문자열
	 * @param b :	변경될 문자열
	 * @return result : 변경된 문자열
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
	 * Desc : property 파일 읽어오기
	 * @param var : 변수명
	 * @return val : property 값
	 * @exception Exception code string
	*/
	public static String getProp (String var)
	{
		String val = "";

		try {
			Properties prop = new Properties();

	        //FileInputStream fin = new FileInputStream("properties");
            //각 시스템별로 경로 지정 및 파일 업로드 olap.properties
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

	public String csprn	 		= null;		// 주민번호(xxxxxxyyyyyyy 형식)
	public String sn			= null; 	// *성명
	public String givenname			= null; 	// *성명
	public String cn			= null; 	// *성명
	public String cshanjanm			= null;		// 성명(한자, 공백없이)
	public String csenglnm			= null;		// 성명(영문, 공백적용)
	public String uid			= null; 	// 아이디
	public String employeenumber 		= null;		// 사번
	public String userPassword		= null; 	// *암호(SHA)
	public String departmentnumber		= null;		// 현재근무부서코드
	public String ou			= null;		// 현재 근무 부서명
	public String employeetype 		= null;		// 사원구분코드
	public String cscmpycd			= null; 	// 회사코드
	public String o				= null; 	// 회사명
	public String csjikryl			= null; 	// 현직렬
	public String csjikgun			= null; 	// 현직군
	public String csjikmu			= null; 	// 현직무
	public String csoctgr			= null; 	// 현직종
	public String csposicd1			= null;		// 직책코드1
	public String csposinm1			= null;		// 직책명1
	public String csposicd2			= null;		// 직책코드2
	public String csposinm2			= null;		// 직책명2
	public String csdutycd			= null;		// 근무지코드
	public String csdutynm			= null;		// 근무지명
	public String csincmpydt		= null;		// 입사일자(yyyymmdd 형식)
	public String csdealbankcd		= null;		// 거래은행코드
	public String csdealbanknm		= null;		// 거래은행명
	public String csacctno			= null;		// 계좌번호(000-0000-0000-0000 형식)
	public String mobile			= null;		// 휴대폰(011-2222-3333  형식)
	public String mail			= null; 	// 이메일주소
	public String cshomeaddr		= null;		// 주소
	public String cshomeaddr2		= null;		// 상세주소
	public String homephone			= null;		// 연락가능 전화번호(111-2222-3333  형식)
	public Vector csmangareacd		= new Vector();		// 관리지역코드 (multi-value)
	public Vector csmangareanm		= new Vector();		// 관리지역명 (multi-value)
	public String csselldeptcd		= null;		// 판매부서코드
	public String csselldeptnm		= null;		// 판매부서명
	public String csbocd			= null;		// 지국코드
	public String csbonm			= null;		// 지국명
	public String csareacd			= null;		// 지역코드
	public String csareanm			= null;		// 지역명
	public String cshrdeptcd		= null;		// 인사부서코드
	public String cshrdeptnm		= null;		// 인사부서명
	public String csboclsfcd		= null;		// 지국구분코드
	public String csboclsfnm		= null;		// 지국구분명
	public String csbillgroupid		= null;		// 빌링그룹ID
	public String csbillgrouptype		= null;		// 빌링그룹유형
	public String csbillincode		= null;		// 빌링소속코드
	public Vector csjobcd			= new Vector();		// 업무코드 (multi-value)
	public Vector csjobnm			= new Vector();		// 업무코드/명 (multi-value, 업무코드|명 표시  예) 000|마일리지정산담당 형식)
	public String csmanageryn		= null;		// 부서장여부
	public String csusertype		= null;		//사용자유형
	public String description		= null;		//사용자유형
	public String csofficd			= null;		// 국코드
	public String csoffinm			= null;		// 국명
	public String csbokscd			= null;		// 부코드
	public String csboksnm			= null;		// 부명
	public Vector csdealdeptcd		= new Vector();		// 관리부서코드 (multi-value)
	public Vector csdealdeptnm		= new Vector();		// 관리부서명 (multi-value, 관리부서코드|관리부서명 표시  예) 3105|지판2부 형식)
	public String cshomezipcode		= null;		// 자택 우편번호(111-222 형식)
	public String csoutcmpydt		= null;		// 퇴사일자(yyyymmdd 형식)
	public String csacctnm			= null;		// 예금주
	public String cslastinfologin		= null;		// 최종접속일
	public String csempcmpycd		= null;		// 근무지회사코드
	public String csempcmpynm		= null;		// 근무지회사명
	public String csbrchofficd		= null;		// 지사코드
	public String csbrchoffinm		= null;		// 지사명
	public String carlicense		= null;		// 최초로그인 전 또는 pwd 리셋 후 (16777216 : 로그인하지 않았슴)
}
***********************************************************/
