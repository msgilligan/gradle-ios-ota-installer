<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<!--
    Copyright (c) 2010-2015, M. Sean Gilligan
    Licensed under the MIT License (see MIT-License-Build-Scripts.txt)
-->
<plist version="1.0">
<dict>
	<key>items</key>
	<array>
		<dict>
			<key>assets</key>
			<array>
				<dict>
					<key>kind</key>
					<string>software-package</string>
					<key>url</key>
					<string>${BASEURL}/${RELEASEID}.ipa</string>
				</dict>
				<dict>
					<key>kind</key>
					<string>full-size-image</string>
					<key>needs-shine</key>
					<false/>
					<key>url</key>
					<string>${BASEURL}/icon512.png</string>
				</dict>
				<dict>
					<key>kind</key>
					<string>display-image</string>
					<key>needs-shine</key>
					<false/>
					<key>url</key>
					<string>${BASEURL}/icon57.png</string>
				</dict>
			</array>
			<key>metadata</key>
			<dict>
				<key>bundle-identifier</key>
				<string>${BUNDLEID}</string>
				<key>bundle-version</key>
				<string>13</string>
				<key>kind</key>
				<string>software</string>
				<key>subtitle</key>
				<string>${CONFIG} Release for iPhone</string>
				<key>title</key>
				<string>${BASENAME}</string>
			</dict>
		</dict>
	</array>
</dict>
</plist>
