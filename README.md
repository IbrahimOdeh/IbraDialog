# IbraDialog

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=21)
[![](https://jitpack.io/v/IbrahimOdeh/IbraDialog.svg)](https://jitpack.io/#IbrahimOdeh/IbraDialog)

This Helpful Dialog for you if you want to make Amazing "About Me" Dialog for your Android App, animatied and easily to use.

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
    ...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	        implementation 'com.github.IbrahimOdeh:IbraDialog:1.0.3'
	}
```

## Screenshots
<img width="300" heigth="600" src="https://github.com/IbrahimOdeh/IbraDialog/blob/main/screenshots/Screenshot_01.png">

## How To Use
``` java
final IbraDialog ibraDialog = new IbraDialog(this);
        ibraDialog.setTitle("Ibrahim Odeh")
                .setSubTitle("Professional Developer")
                .setContent("I am Android and Web Developer, who provides the best services for your or your business.")
                .setIcon(com.ibrahimodeh.ibradialog.R.drawable.ibrahim_logo)
                .setFollow("Follow Me")
                .setFacebookURL("https://fb.me/IbrahimOdehWebsite")
                .setTwitterURL("https://twitter.com/IbrahimOdeh95")
                .setInstagramURL("https://www.instagram.com/ibrahim0deh")
                .setPinterestURL("https://www.pinterest.com/ibrahimodeh1995")
                .setWebsiteURL("https://www.ibrahimodeh.com")
                .isCancelable(true)
                .show();
```

## Table of Useful Methods
<table>
  <tr>
    <th>Method</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>setTitle(String)</td>
    <td>The Title Text of the Dialog.</td>
  </tr>
  <tr>
    <td>setSubTitle(String)</td>
    <td>The sub Title Text of the Dialog.</td>
  </tr>
	  <tr>
    <td>setContent(String)</td>
    <td>The Content Description Text of the Dialog.</td>
  </tr>
  <tr>
    <td>setIcon(int)</td>
    <td>Set the Image of the Dialog.</td>
  </tr>
  <tr>
    <td>setFollow(String)</td>
    <td>Set the Text For the "Folllow Us" section.<br></td>
  </tr>
  <tr>
    <td>setFacebookURL(String)</td>
    <td>Set your Facebook URL.</td>
  </tr>
	 <tr>
    <td>setTwitterURL(String)</td>
    <td>Set your Twitter URL.</td>
  </tr>
		 <tr>
    <td>setInstagramURL(String)</td>
    <td>Set your Instagram URL.</td>
  </tr>
  </tr>
		 <tr>
    <td>setPinterestURL(String)</td>
    <td>Set your Pinterest URL.</td>
  </tr>
  </tr>
		 <tr>
    <td>setWebsiteURL(String)</td>
    <td>Set your Website URL for the Button.</td>
  </tr>
  </tr>
		 <tr>
    <td>isCancelable(boolean)</td>
    <td>Set Dialog is Cancelable or not (true or false).</td>
  </tr>
</table>

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/IbrahimOdeh/IbraDialog/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Follow Me
- [My Website](https://ibrahimodeh.com)
- [Twitter](https://twitter.com/IbrahimOdeh95)
- [Github](https://github.com/IbrahimOdeh)
- [Instagram](https://www.instagram.com/ibrahim0deh)
- [Facebook](https://fb.me/IbrahimOdehWebsite)

## License

```
MIT License

Copyright (c) 2019-2022 Ibrahim Odeh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
