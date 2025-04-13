# Starsector IntelliJ Mod Template

## Description

This is a template for a generic Starsector mod using Java.

When you are done, you will have a mod that does nothing, but is ready for anything to be added.

Written for IntelliJ Community ([free download](https://www.jetbrains.com/idea/download)), but should work with any IDE.
You do NOT need IntelliJ Ultimate. Latest version of IntelliJ is 2024.3 as of writing.

## Optional

- Change `LICENSE` to something else.

## Initial

- Download or `git clone` this repository wherever you want to work.
  - The simplest is to put it right into your mods folder; otherwise, you'll need to either copy it each time you change things or make an alias to it.

## FAQ

- I already have a mod started. Can I just drag and drop this into my mod folder?
    - Yes, but don't overwrite anything you already have.
    - You probably mostly want the `.idea` folder (which contains IntelliJ configuration) and the `src` folder - then,
      move any code you have into the `src` folder and fix the `package` in each .java file (ask if you don't know how).
- Everything is working! Do I still need the `readme_files` folder?
  - lol no, delete it.

## Explanation of Folders/Files

The template contains many folders and files that are commonly used, but not all.
You may not need everything, but leaving them in place doesn't hurt either.

- `.git/` Optional. Used by git to store all git-related information. May be deleted if you are not using git.
- `.idea/` Required. Used by IntelliJ to store settings and configuration.
- `.run/` Optional. Used by IntelliJ, contains a ready-to-use configuration for running the game. May be deleted if you
  want to make your own Run Configuration instead.
- `data/` Optional. Used by Starsector, this folder just contains some common files that mods use that you would
  probably end up creating yourself. May be deleted if you don't need it.
- `graphics/` Optional. Default location to place images of all kinds.
- `sounds/` Optional. Default location to place sounds, including music, which you then add to `data/config/sounds.json`.
- `src/` Optional? Contains example source code which you will presumably build upon. May be deleted if your mod doesn't
  have any code (but then why use this template...?)
- `.gitignore` Optional. Used by git to determine which files should not be committed (for example, not to commit temp
  files used during the build process). May be deleted if not using git.
- `LICENSE` Optional. This is the license file, delete or modify it to your liking.
- `mod_info.json` Required.
- `README.md` Required?
- `yourName_uniqueid.version` Optional. This is a sample Version Checker file. May be deleted if not using Version
  Checker (but you should).


## IntelliJ Configuration
Guide here: https://starsector.wiki.gg/wiki/IntelliJ_IDEA_Setup

## Other

Author: Wisp

Lowtech Tempest: Selkie

[GraphicsLib]: https://fractalsoftworks.com/forum/index.php?topic=10982.0
[MagicLib]: https://github.com/MagicLibStarsector/MagicLib/
[LazyLib]: https://github.com/LazyWizard/lazylib/
[LunaLib]: https://github.com/Lukas22041/LunaLib/
[Nexelerin]: https://github.com/Histidine91/Nexerelin/
