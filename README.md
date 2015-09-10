Core Shield - android game
This is a fork of https://github.com/o2genum/CoreGame with some gameplay improvements

===================================
Play store link: https://play.google.com/store/apps/details?id=me.montecode.coregame

Screenshots:
------------

<img src="https://raw.github.com/o2genum/CoreGame/master/etc/screenshot-for-readme1.png" width="32.5%"> &nbsp;
<img src="https://raw.github.com/o2genum/CoreGame/master/etc/screenshot-for-readme2.png" width="32.5%"> &nbsp;


The game:
---------

The rules are simple:

* protect the core (big cyan dot in the center of the screen) as long as possible
* gain health (cyan dots) and use shields (blue dots)

This game is an Android version of [Hakim El Hattab's "Core"](http://www.chromeexperiments.com/detail/core/)

The code:
--------
Game framework (`ru.o2genum.coregame.framework` package) was initially taken from [Mario Zechner's "Beginning Android Games"](http://code.google.com/p/beginning-android-games/) book. I've modified a few sources and adapted them to my needs. The game itself is contained within the `ru.o2genum.coregame.game` package. Almost all game logic is in the `World.java`.

License:
-------
The game is licensed under [Open Source Initiative MIT License](http://www.opensource.org/licenses/mit-license.php).